package eventdemo.Publisher;
import eventdemo.events.CustomEvents;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

public class CustomEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publishEvent(String message) {
        CustomEvents event = new CustomEvents(this, message);
        applicationEventPublisher.publishEvent(event);
        System.out.println("Published Event: " + message);
    }
}