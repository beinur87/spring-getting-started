package ro.sda.spring._1_;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring._1_.beans.Cat;
import ro.sda.spring._1_.components.Dog;
import ro.sda.spring._1_.config.ProjectConfig;

public class Main {
    public static void main(String[] args) {

        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class)){
            Cat c1 = context.getBean(Cat.class);
            c1.setMeow();
            Cat c2 = context.getBean(Cat.class);
            c2.setMeow();
            Dog d1 = context.getBean(Dog.class);
            d1.sayHam();

        }


    }
}