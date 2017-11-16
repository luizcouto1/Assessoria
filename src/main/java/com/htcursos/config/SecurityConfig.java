package com.htcursos.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableAutoConfiguration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception{
		auth.jdbcAuthentication().dataSource(dataSource)
		.usersByUsernameQuery("select login, senha, enabled from usuario where login=?")
		.authoritiesByUsernameQuery("select login, role from usuario_roles where login=?");
	}
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/", "/home").permitAll().antMatchers("/", "/home").permitAll().antMatchers("/admin").hasRole("ADMIN")
		.anyRequest().authenticated().and().formLogin().loginPage("/login.html").permitAll().and().logout()
		.permitAll();
		http.exceptionHandling().accessDeniedPage("/403");
	}

}
