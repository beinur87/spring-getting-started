package ro.sda.spring;

public class Main {
    public static void main(String[] args) {
        User u1 = new User();
        u1.setFirstName("Beinur");
        u1.setLastName("Nurla");
        u1.setAge(36);
        System.out.println(u1);

        User u2 = new User("Emel", "Nurla", 33);
        System.out.println(u2);

    }
}