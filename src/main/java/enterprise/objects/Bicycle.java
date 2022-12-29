
package enterprise.objects;

import enterprise.interfaces.Vehicle;

public class Bicycle implements Vehicle {

    int bicycleNumber;

    public Bicycle(int bikeNumber) {
        this.bicycleNumber = bikeNumber;
    }

    @Override
    public void vehicleInfo() {

        String info = "Bicycle #" + bicycleNumber;

        System.out.println(info);
    }
}
