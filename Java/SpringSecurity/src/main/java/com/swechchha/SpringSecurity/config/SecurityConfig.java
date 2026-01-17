// jwt token -??
package com.swechchha.SpringSecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig{
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Bean
	public SecurityFilterChain securityChain(HttpSecurity http)throws Exception {
return	http
		.csrf(customizer->customizer.disable())
		.authorizeHttpRequests(request->request
				.requestMatchers("register", "login")
				.permitAll()
				.anyRequest().authenticated())
		.httpBasic(Customizer.withDefaults())
		.sessionManagement(session->
		session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
		.build();

	}
	
	@Bean
	public AuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
		provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
		provider.setUserDetailsService(userDetailsService);
		return provider;
	}
	
	@Bean
	public AuthenticationManager authenticationNanager(AuthenticationConfiguration config) throws Exception {
		return config.getAuthenticationManager();
	}
	
}



// this is used for connecting with databases
//package com.swechchha.SpringSecurity.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig{
//	@Autowired
//	private UserDetailsService userDetailsService;
//	
//	@Bean
//	public SecurityFilterChain securityChain(HttpSecurity http)throws Exception {
//return	http
//		.csrf(customizer->customizer.disable())
//		.authorizeHttpRequests(request->request.anyRequest().authenticated())
//		.httpBasic(Customizer.withDefaults())
//		.sessionManagement(session->
//		session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//		.build();
//
//	}
//	
//	@Bean
//	public AuthenticationProvider authenticationProvider() {
//		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
////		provider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
//		provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
//		provider.setUserDetailsService(userDetailsService);
//		return provider;
//	}
//	
//}


// in this code we are login with the hardcoded user details not with DB
//package com.swechchha.SpringSecurity.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig{
//	
//	@Bean
//	public SecurityFilterChain securityChain(HttpSecurity http)throws Exception {
//return	http
//		.csrf(customizer->customizer.disable())
//		.authorizeHttpRequests(request->request.anyRequest().authenticated())
//		.httpBasic(Customizer.withDefaults())
//		.sessionManagement(session->
//		session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//		.build();
//
//	}
//	
//	@Bean
//	public UserDetailsService userDetailsService() {
//		
//		UserDetails user1 = User
//				.withDefaultPasswordEncoder()
//				.username("Swe")
//				.password("s@123")
//				.roles("USER")
//				.build();
//		
//		UserDetails user2 = User
//				.withDefaultPasswordEncoder()
//				.username("Harsh")
//				.password("h@123")
//				.roles("Admin")
//				.build();
//				
//		
//		return new InMemoryUserDetailsManager(user1, user2);
//	}
//	
//}



//package com.swechchha.SpringSecurity.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.Customizer;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configurers.CsrfConfigurer;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig {
//	
//	@Bean
//	public SecurityFilterChain securityChain(HttpSecurity http) throws Exception {
//		
//return		http
//			.csrf(customizer->customizer.disable())
//			.authorizeHttpRequests(request->request.anyRequest().authenticated())
//			.httpBasic(Customizer.withDefaults())
//			.sessionManagement(session->
//			session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//			.build();
//		
////		http.csrf(customizer->customizer.disable());
////		http.authorizeHttpRequests(request->request.anyRequest().authenticated());
//////		http.formLogin(Customizer.withDefaults());
////		http.httpBasic(Customizer.withDefaults());
////		http.sessionManagement(session->session
////				.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
////		return http.build();
//	    
////		   // Defining the customizer correctly
////	    Customizer<CsrfConfigurer<HttpSecurity>> custCsrf = new Customizer<CsrfConfigurer<HttpSecurity>>() {
////	        @Override
////	        public void customize(CsrfConfigurer<HttpSecurity> customizer) {
////	            customizer.disable(); // Disabling CSRF protection
////	        }
////	    };
//		
//		
//	}
//
//}
