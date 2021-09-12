package com.solinvictus.DemoSpringMVC.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@ComponentScan(basePackages = { "com.solinvictus.DemoSpringMVC" })
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean(name = "passwordEncoder")
	public PasswordEncoder encoder() {
		//System.out.println("passwordEncoder Bean Creation started");
		//return new BCryptPasswordEncoder();
		return NoOpPasswordEncoder.getInstance();
	}
	
    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
    	
        httpSecurity.authorizeRequests()
        .antMatchers("/login").permitAll()  
        //.antMatchers("/home").hasRole("USER")
        .antMatchers(HttpMethod.GET,"/home").authenticated()
        .antMatchers(HttpMethod.POST,"/home").authenticated()
        //.antMatchers(HttpMethod.POST, "/home#**").authenticated()
        //.antMatchers("/home").authenticated()
        //.antMatchers("/home").authenticated()
        //.antMatchers("/home").authenticated()
        //.antMatchers("/home").authenticated();
        .and()  
        .formLogin()
        .loginPage("/login")
        .usernameParameter("user")
        .passwordParameter("password")
        .defaultSuccessUrl("/home")
        .failureUrl("/login")
        .and()
        .csrf().disable();
        
        httpSecurity.logout()  
        .logoutRequestMatcher(new AntPathRequestMatcher("/logout"));
        
        
    }
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {  
        //auth.authenticationProvider(authProvider());
    	System.out.println("UserDetailsService object found");
        auth.userDetailsService(userDetailsService);
        System.out.println("auth performed ");
        
    }   

	/*private AuthenticationProvider authProvider() {
		DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
	    authProvider.setUserDetailsService(userDetailsService);
	    authProvider.setPasswordEncoder(encoder());
	    return authProvider;
	}*/
}