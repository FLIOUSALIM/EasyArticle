package org.melsif.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by fliou on 27/09/17.
 */

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("password").authorities("ROLE_USER").and()
                .withUser("admin").password("password").authorities("ROLE_ADMIN", "ROLE_USER");
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .formLogin()
                    .loginPage("/login")
                .and()
                .httpBasic()
                .and()
                .authorizeRequests()
                    .antMatchers("/admin").hasAuthority("ROLE_ADMIN")
                    .antMatchers("/user").hasAuthority("ROLE_USER")
                    .anyRequest().permitAll();
    }
}
