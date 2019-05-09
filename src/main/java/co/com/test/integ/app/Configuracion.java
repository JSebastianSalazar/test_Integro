package co.com.test.integ.app;
import org.springframework.context.annotation.Configuration;



@Configuration
public class Configuracion  {
    /**

    @Bean
    public MapReactiveUserDetailsService userDetailsRepository() {
        UserDetails user = User.withDefaultPasswordEncoder().username("sebastian")
                .roles("ADMIN").password("1234").build();
        UserDetails user2 = User.withUsername("jeiner").roles("USER").password("12343").build();
        return new MapReactiveUserDetailsService(user, user2);
    }

    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(ServerHttpSecurity http) {
        http.authorizeExchange()
                .pathMatchers(HttpMethod.POST ,"/login").permitAll()
                .pathMatchers(HttpMethod.POST ,"/crear").permitAll()
                .pathMatchers(HttpMethod.POST, "api_mascota").permitAll()
                .pathMatchers(HttpMethod.GET, "api_mascota").permitAll()
                .pathMatchers(HttpMethod.POST, "api_medico").permitAll()
                .pathMatchers(HttpMethod.GET, "api_medico").permitAll()
                .pathMatchers(HttpMethod.POST, "api_propietario").permitAll()
                .pathMatchers(HttpMethod.GET, "api_propietario").permitAll()
                .anyExchange().authenticated().and()
                 .csrf().disable()
                .httpBasic().and();
        return http.build();
    }
*/
}