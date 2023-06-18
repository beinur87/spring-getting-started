package ro.sda.spring.with_partial_di;

public class Main {
    public static void main(String[] args) {
        AlertConsumer consumer = new AlertConsumer(new EmailService());
        consumer.processMessage("test message", "beinur.nurla@gmail.com");

        consumer = new AlertConsumer(new SmsService());
        consumer.processMessage("test sms message", "+40735939113");
    }
}
