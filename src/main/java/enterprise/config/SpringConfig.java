
package enterprise.config;

import enterprise.enums.Automaker;
import enterprise.enums.Transmission;
import enterprise.objects.Bicycle;
import enterprise.objects.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;
import java.util.Random;

@Configuration
@PropertySource("classpath:application.properties")
public class SpringConfig {

    @Value("${fordModel}")
    private String fordModel;

    @Bean
    public Car ford() {
        return new Car(Automaker.FORD, fordModel, Transmission.AUTOMATIC, 5.0, 120);
    }

    @Value("${dodgeModel}")
    private String dodgeModel;

    @Bean
    public Car dodge() {
        return new Car(Automaker.DODGE, dodgeModel, Transmission.MANUAL, 5.7, 118);
    }

    @Value("${chevroletModel}")
    private String chevroletModel;

    @Bean
    public Car chevrolet() {
        return new Car(Automaker.CHEVROLET, chevroletModel, Transmission.VARIABLE, 5.3, 114);
    }

    @Bean
    @Scope("prototype")
    public Bicycle bicycle() {

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        return new Bicycle(randomNumber);
    }
}
