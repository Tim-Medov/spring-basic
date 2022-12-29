
package enterprise.objects;

import enterprise.enums.Automaker;
import enterprise.enums.Transmission;
import enterprise.interfaces.Vehicle;

public class Car implements Vehicle {

    Automaker automaker;
    String model;
    Transmission transmission;
    double engineVolume;
    int maxSpeed;

    public Car(Automaker automaker, String model, Transmission transmission, double engineVolume, int maxSpeed) {
        this.model = model;
        this.automaker = automaker;
        this.transmission = transmission;
        this.engineVolume = engineVolume;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void vehicleInfo() {

        String info = "Automaker: " + automaker + "\n" +
                "Model: " + model + "\n" +
                "Transmission: " + transmission + "\n" +
                "Engine Volume: " + engineVolume + "L" + "\n" +
                "Max speed: " + maxSpeed + " mph";

        System.out.println(info + "\n");
    }
}
