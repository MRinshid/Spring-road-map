package eventdemo.listener;
import eventdemo.events.CustomEvents;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEventListener implements ApplicationListener<CustomEvents> {
    @Override
    public void onApplicationEvent(CustomEvents event) {
        System.out.println("Received Event: " + event.getMessage());
    }
}
