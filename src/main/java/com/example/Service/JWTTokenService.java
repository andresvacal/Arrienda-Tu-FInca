package com.example.Service;

import java.security.Key;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;
import com.example.DTO.ArrendadorDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Service
public class JWTTokenService {
    private long jwtExpiration = 99999999;
    private Key jwtKey = Keys.secretKeyFor(SignatureAlgorithm.HS512);

    public String generarToken(ArrendadorDTO usuario) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + jwtExpiration);
        Collection<? extends GrantedAuthority> authorities = new ArrayList<>();
        return Jwts.builder()
                .setSubject(usuario.getCorreoElectronico()) // Almacenar solo el correo electrónico como sujeto
                .setIssuedAt(now)
                .setExpiration(expiryDate)
                .claim("authorities", authorities.stream()
                        .map(GrantedAuthority::getAuthority)
                        .collect(Collectors.toList()))
                .signWith(jwtKey, SignatureAlgorithm.HS512)
                .compact();
    }

    public String getUsername(String jwtToken) {
        return decodificarToken(jwtToken).getSubject();
    }

    public Date getFechaExpiracion(String jwtToken) {
        return decodificarToken(jwtToken).getExpiration();
    }

    public Claims decodificarToken(String jwtToken) {
        return Jwts.parserBuilder()
                .setSigningKey(jwtKey)
                .build()
                .parseClaimsJws(jwtToken)
                .getBody();
    }

    public boolean validateToken(String token, String username) {
        final String tokenUsername = getUsername(token);
        return (tokenUsername.equals(username) && !isTokenExpired(token));
    }

    private boolean isTokenExpired(String token) {
        return getFechaExpiracion(token).before(new Date());
    }
}
