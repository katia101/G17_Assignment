package za.ac.cput.SecurityConfig;

import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
 class Config extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("admin")
                .password("12345")
                .roles("admin")
                .and()
                .withUser("client")
                .password("54321")
                .roles("user");

    }

    @Override
    protected  void configure(HttpSecurity http) throws  Exception{
//        super.configure(http);

        http.httpBasic()
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST,"**/create").hasRole("admin")
                .antMatchers(HttpMethod.DELETE,"**/delete").hasRole("admin")
                .antMatchers(HttpMethod.POST, "**/update").hasRole("user")
                .antMatchers(HttpMethod.GET, "**/getAll").hasAnyRole("admin","user")
                .and()
                .csrf().disable()
                .formLogin().disable();


    }

}
