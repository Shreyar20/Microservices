package com.demo.Security;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.context.annotation.Configuration;




@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	  @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.inMemoryAuthentication()
	        .withUser("Shreya")
	        .password("admin")
	        .roles("ADMIN")
	        .and()
	        .withUser("Kirti")
	        .password("admin")
	        .roles("ADMIN");
	    }

	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.authorizeRequests()
	               
	                .antMatchers("/patient").hasRole("ADMIN")
	                .antMatchers("/getPatient/{username}").hasRole("ADMIN")
	                
	                .antMatchers("/deletePatient/{patientid}").hasRole("ADMIN")
	                .antMatchers("/").permitAll()
	                .and().formLogin();
         http.csrf().disable();
        
    http.headers().frameOptions().disable();

	    }
	
		@Bean
		public PasswordEncoder getPasswordEncoder(){
			return NoOpPasswordEncoder.getInstance();
		}
	}


