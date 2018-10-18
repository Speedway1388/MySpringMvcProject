package ua.com.threedob.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;
//import sun.rmi.server.Dispatcher;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by Yurij on 18.08.2017.
 */
public class WebInit implements WebApplicationInitializer{
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WebConfig.class);

        DelegatingFilterProxy delegatingFilterProxy = new DelegatingFilterProxy();
        servletContext.addFilter("springSecurityFilterChain",delegatingFilterProxy).addMappingForUrlPatterns(null,false,"/*");
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
        ServletRegistration.Dynamic registration = servletContext.addServlet("dispatcherServlet",dispatcherServlet);
        registration.setLoadOnStartup(1);
        registration.addMapping("/");
    }
}
