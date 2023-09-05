package com.polarbookshop.edgeservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

/**
 * @author Tom89757
 */

@EnableWebFluxSecurity
public class SecurityConfig {
    @Bean
    SecurityWebFilterChain springSecurityFilterChain(
            ServerHttpSecurity http
    ) {
        return http
                .authorizeExchange(exchange ->
                        exchange.anyExchange().authenticated()) //所有请求都需要身份验证
//                .formLogin(Customizer.withDefaults()) //通过登录表单启用用户身份验证
                .oauth2Login(Customizer.withDefaults())
                .build();
    }
}
