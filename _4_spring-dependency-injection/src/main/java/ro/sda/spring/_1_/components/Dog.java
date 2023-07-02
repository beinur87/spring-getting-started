package ro.sda.spring._1_.components;

import org.springframework.stereotype.Component;

@Component
public class Dog {
    public Dog(){
        System.out.println("Dog is being created");
    }
    public void sayHam(){
        System.out.println("Ham Ham");
    }
}
