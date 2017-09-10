package ua.com.threedob.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by Yurij on 18.08.2017.
 */
@Configuration
@EnableWebMvc
@ComponentScan("ua.com.threedob")
public class WebConfig extends WebMvcConfigurerAdapter{
    @Bean
    public InternalResourceViewResolver viewResolver(){

        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/pages/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/image/**").addResourceLocations("/static/images/");
        registry.addResourceHandler("/css/**").addResourceLocations("/static/styles/");
    }
}
