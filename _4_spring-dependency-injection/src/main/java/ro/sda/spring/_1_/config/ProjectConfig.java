package ro.sda.spring._1_.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring._1_.beans.Cat;


@Configuration
@ComponentScan(basePackages = "ro.sda.spring._1_.components")
public class ProjectConfig {
    //the method is marked this method as bean which tells spring that it needs to manage this component
    // by manage we understand that this component is going to register
    @Bean
    public Cat cat(){
        System.out.println("Cat bean is creating");
        return new Cat();
    }

}
