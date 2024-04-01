package com.devsuperior.dsmeta.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/h2/**", "/report-sales/**").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .and()
                .csrf().ignoringAntMatchers("/h2/**", "/report-sales/**")
                .and()
                .headers().frameOptions().sameOrigin();
    }
}


