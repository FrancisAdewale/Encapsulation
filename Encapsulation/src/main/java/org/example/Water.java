package org.example;

public class Water extends Environment<Swimmable>{
    int maxSpeed = 30;
    @Override
    public void checkTraffic() {
        for(Swimmable swim : traffic ) {
            if(swim.getSpeed() > maxSpeed) {
                System.out.println(swim.getClass().getSimpleName() + " is going too fast");
            } else {
                System.out.println(swim.getClass().getSimpleName() + " is swimming!");

            }
        }

    }

    @Override
    public void checkVehicles() {
        for (Swimmable vehicle : traffic){
            if(vehicle instanceof  Vehicle) {
                System.out.println(vehicle.getClass().getSimpleName() + "is being driven");
            }
        }
    }
}
