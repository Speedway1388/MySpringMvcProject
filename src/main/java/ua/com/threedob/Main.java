package ua.com.threedob;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.com.threedob.entity.User;
import ua.com.threedob.service.Implementation.UserServiceImpl;
import ua.com.threedob.service.UserService;

/**
 * Created by Yurij on 17.08.2017.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ua.com.threedob.config");
        UserService userService = context.getBean(UserServiceImpl.class);
        userService.save("Vasia","Petechkin","vasia@gmail.com","adsadas");
 //       UserServiceImpl service = new UserServiceImpl();
//        service.save("Vasia","Petechkin","vasia@gmail.com","adsadas");
        //service.save(new User("Vasia","Petechkin","vasia@gmail.com","adsadas"));







    }
}
