package org.example2;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;
@Component
public class EmployeeBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("EmployeeBeanPostProcessor: Before Initialization - " + beanName);
        if (bean instanceof Employee) {
            ((Employee) bean).setName("John Doe (Before Init)");
            ((Employee) bean).setRole("Developer (Before Init)");
        }
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("EmployeeBeanPostProcessor: After Initialization - " + beanName);
        if (bean instanceof Employee) {
            ((Employee) bean).setName("Rinshid (After Init)");
            ((Employee) bean).setRole("Jr.Developer (After Init)");
        }
        return bean;
    }
}
