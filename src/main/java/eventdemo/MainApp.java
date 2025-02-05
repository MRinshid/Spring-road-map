package eventdemo;
import eventdemo.Publisher.CustomEventPublisher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        CustomEventPublisher publisher = (CustomEventPublisher) context.getBean("CustomEventPublisher");
        publisher.publishEvent("Hello!");
    }
}
