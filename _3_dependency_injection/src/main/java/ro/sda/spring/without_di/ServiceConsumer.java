package ro.sda.spring.without_di;

public class ServiceConsumer {
    private EmailService service = new EmailService();
    public void processMessage(String msg, String receiver){
        service.sendEmail(msg, receiver);
    }
}
