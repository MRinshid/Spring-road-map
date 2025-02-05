package eventdemo.events;
import org.springframework.context.ApplicationEvent;

public class CustomEvents extends ApplicationEvent{
    private final String message;

    public CustomEvents(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
