package org.example;

public class Sky extends Environment<Flyable> {
    int maxSpeed = 70;
    double startX;
    double startY;
    double direction;

    int[][] grid = new int[][]{
            {9,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
    };
    @Override
    public void checkTraffic() {
       for(Flyable flyable : traffic ) {
           System.out.println(flyable.getClass().getSimpleName() + " is flying!");
       }

    }

    @Override
    public void checkVehicles() {
        for (Flyable vehicle : traffic){
            if(vehicle instanceof  Vehicle) {
                System.out.println(vehicle.getClass().getSimpleName() + " is flying");
            }
        }

    }
}
