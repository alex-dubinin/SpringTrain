package hello;

import org.springframework.context.annotation.*;
import org.springframework.context.ApplicationContext;


@Configuration
@ComponentScan
public class Application {

    @Bean
    MessageService mockMessageService() {
        return new MessageService() {
            public String getMessage() {
                return "Hello World!";
            }
        };
    }
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Application.class);  //наш контейнер
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}


