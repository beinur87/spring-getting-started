package ro.sda.spring.with_partial_di;

public class AlertConsumer {
    private MessageService service;


    public AlertConsumer(MessageService service){
        this.service = service;
    }

    public void processMessage(String msg, String receiver){
        service.sendMessage(msg, receiver);
    }
}
