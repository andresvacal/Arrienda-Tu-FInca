package com.example.Security;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.filter.OncePerRequestFilter;

import com.example.Service.JWTTokenService;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.security.SignatureException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
@Service
public class JWTAuthorizationFilter extends OncePerRequestFilter {
    public static final String HEADER = "Authorization";
    public static final String PREFIX = "Bearer ";

    @Autowired
    private CustomUserDetailsService userDetailsService;

    @Autowired
    private JWTTokenService jwtTokenService;

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull FilterChain chain) throws ServletException, IOException {
        System.out.println("-------->>>-------->>> Filtro");
        try {
            if (existeJWTToken(request)) {
                Claims claims = validarToken(request);
                if (claims.get("authorities") != null) {
                    String username = getUsername(request);
                    System.out.println("Usuario autenticado: " + username);
                    UserDetails userDetails = userDetailsService.loadUserByUsername(username);
                    if (jwtTokenService.validateToken(request.getHeader(HEADER).replace(PREFIX, ""), userDetails.getUsername())) {
                        UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(username, null, userDetails.getAuthorities());
                        auth.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
                        SecurityContextHolder.getContext().setAuthentication(auth);
                        System.out.println("Autenticación exitosa para el usuario: " + username);
                    } else {
                        System.out.println("Token inválido para el usuario: " + username);
                    }
                } else {
                    SecurityContextHolder.clearContext();
                    System.out.println("El token no contiene las autoridades necesarias.");
                }
            } else {
                SecurityContextHolder.clearContext();
                System.out.println("No se encontró un token JWT en la solicitud.");
            }
            chain.doFilter(request, response);
        } catch (ExpiredJwtException e) {
            System.out.println("El token JWT ha expirado: " + e.getMessage());
            response.sendError(HttpServletResponse.SC_FORBIDDEN, "El token JWT ha expirado.");
        } catch (UnsupportedJwtException e) {
            System.out.println("El token JWT no es soportado: " + e.getMessage());
            response.sendError(HttpServletResponse.SC_FORBIDDEN, "El token JWT no es soportado.");
        } catch (MalformedJwtException e) {
            System.out.println("El token JWT está malformado: " + e.getMessage());
            response.sendError(HttpServletResponse.SC_FORBIDDEN, "El token JWT está malformado.");
        } catch (SignatureException e) {
            System.out.println("La firma del token JWT no es válida: " + e.getMessage());
            response.sendError(HttpServletResponse.SC_FORBIDDEN, "La firma del token JWT no es válida.");
        } catch (Exception e) {
            System.out.println("Error al validar el token JWT: " + e.getMessage());
            response.sendError(HttpServletResponse.SC_FORBIDDEN, "Error al validar el token JWT.");
        }
    }

    private Claims validarToken(HttpServletRequest request) {
        String jwtToken = request.getHeader(HEADER).replace(PREFIX, "");
        return jwtTokenService.decodificarToken(jwtToken);
    }

    private String getUsername(HttpServletRequest request) {
        String jwtToken = request.getHeader(HEADER).replace(PREFIX, "");
        return jwtTokenService.getUsername(jwtToken);
    }

    private boolean existeJWTToken(HttpServletRequest request) {
        String authenticationHeader = request.getHeader(HEADER);
        return authenticationHeader != null && authenticationHeader.startsWith(PREFIX);
    }
}
