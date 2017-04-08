package soc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;



@Configuration
@ComponentScan("soc")
@EnableWebMvc
public class AppConfig {
    @Bean
    public UrlBasedViewResolver setupViewResolver(){
        UrlBasedViewResolver resolverRegistration = new UrlBasedViewResolver();
        resolverRegistration.setPrefix("/WEB-INF/pages/");
        resolverRegistration.setSuffix(".jsp");
        resolverRegistration.setViewClass(JstlView.class);
        resolverRegistration.setOrder(1);
        return resolverRegistration;
    }

}
