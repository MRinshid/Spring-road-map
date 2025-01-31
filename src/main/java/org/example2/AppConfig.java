package org.example2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
    @Bean
    public Employee employee() {
        Employee employee = new Employee();
        employee.setName("mohammed");
        employee.setRole("Tester");
        return employee;
    }
}
