package ro.sda.spring.without_di;

public class Main {
    public static void main(String[] args) {

        ServiceConsumer serviceConsumer = new ServiceConsumer();
        serviceConsumer.processMessage("ALERT", "beinur.nurla@gmail.com");
    }
}