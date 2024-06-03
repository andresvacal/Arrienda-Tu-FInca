package com.example.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.OrRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig implements ISecurityConfig {
    @Autowired
    private JWTAuthorizationFilter jwtAuthorizationFilter;
	@Override
    @Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Override
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }
	@Override
    @Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {
        
    
        http.addFilterBefore(jwtAuthorizationFilter, UsernamePasswordAuthenticationFilter.class).
                                csrf(csrf -> csrf.ignoringRequestMatchers(ignoreSpecificRequests()));
		return http.build();
	}
	private RequestMatcher ignoreSpecificRequests() {
        return new OrRequestMatcher(
            new AntPathRequestMatcher("/indicadoressuim/api/autenticacion"),
            new AntPathRequestMatcher("/indicadoressuim/api/peticion-mes"),
            new AntPathRequestMatcher("/jwt/security/autenticar/**", "GET"),
            new AntPathRequestMatcher("/jwt/security/autenticar/**", "POST"),
            new AntPathRequestMatcher("/jwt/security/autenticar/**", "PUT"),
            new AntPathRequestMatcher("/jwt/security/autenticar/**", "DELETE"),
            new AntPathRequestMatcher("/grupo27/arrendador/login", "GET"),
            new AntPathRequestMatcher("/grupo27/arrendador/login", "POST"),
            new AntPathRequestMatcher("/grupo27/arrendador/login", "PUT"),
            new AntPathRequestMatcher("/grupo27/arrendador/login", "DELETE"),
            new AntPathRequestMatcher("/grupo27/arrendador/GuardarArrendador", "GET"),
            new AntPathRequestMatcher("/grupo27/arrendador/GuardarArrendador", "POST"),
            new AntPathRequestMatcher("/grupo27/arrendador/GuardarArrendador", "PUT"),
            new AntPathRequestMatcher("/grupo27/arrendador/login", "DELETE")
            
            
        );
    }
}