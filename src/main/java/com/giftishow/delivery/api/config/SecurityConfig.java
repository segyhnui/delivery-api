package com.giftishow.delivery.api.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .httpBasic().disable()  // spring security 기본은 로그인 인증창. disable
                .csrf().disable()   // rest api csrf disable
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS) // jwt token 인증이므로

                .and()
                .authorizeRequests()
                .antMatchers("/v1/api/bo/**").hasAnyRole("ADMIN")   // 특정 경로의 특정 권한을 검사함
                .anyRequest().authenticated()
        ;
    }
}
