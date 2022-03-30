import config.BeanConfig;
import models.VideoGame;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.VideoGameService;
/*
* What is Spring?
*   Spring is a module based opensource Java framework
*
* What is a spring module
*  - a grouping of libraries to achieve some goal
*  - spring modules work really well together
*
* Common Spring Modules:
*   - Spring Core <---- We will be looking at this one today
*   - Spring Data <---- Deals with persistence
*   - Spring MVC <---- Http Handler
*   - Spring AOP <---- Deals with aspects
*
* What is a Spring Bean?
*   - A class that its dependencies will be managed by spring
*
* What is IOC (Inversion of Control)?
*  - When you give up some functionality to another entity
*
* What is Dependency Injection?
*  - When you give up the instantiation of your dependencies to another entity
*
* How do we define our IOC container?
*    - BeanFactory (old way <---- doesnt allow annotation configurations)
*    - ApplicationContext
*
* */
public class MainDriver {

    //static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
    static ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
    public static void main(String[] args) {
        VideoGameService videoGameService = applicationContext.getBean(VideoGameService.class);

        System.out.println(videoGameService.getAll());

    }
}
