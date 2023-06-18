package ro.sda.spring.with_partial_di;

public class SmsService implements MessageService{
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("SMS sent to " + receiver + " with message " + message);
    }
}
