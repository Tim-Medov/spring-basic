
package enterprise;

import enterprise.config.SpringConfig;
import enterprise.objects.Bicycle;
import enterprise.objects.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Car ford = context.getBean("ford", Car.class);
        ford.vehicleInfo();

        Car dodge = context.getBean("dodge", Car.class);
        dodge.vehicleInfo();

        Car chevrolet = context.getBean("chevrolet", Car.class);
        chevrolet.vehicleInfo();

        Bicycle bicycle1 = context.getBean("bicycle", Bicycle.class);
        bicycle1.vehicleInfo();

        Bicycle bicycle2 = context.getBean("bicycle", Bicycle.class);
        bicycle2.vehicleInfo();

        Bicycle bicycle3 = context.getBean("bicycle", Bicycle.class);
        bicycle3.vehicleInfo();

        context.close();
    }
}
