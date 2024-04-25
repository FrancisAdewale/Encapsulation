package org.example;

public class Aeroplane extends Vehicle implements Flyable, Driveable{
    @Override
    public void fly() {
        System.out.println("Plane is flyijng..");

    }

    @Override
    public void move() {

    }

    @Override
    public void drive() {

    }

    @Override
    public int getSpeed() {
        return 40;
    }

    @Override
    public int[] getPosition() {
        return new int[]{3,1};
    }

    @Override
    public String getDirection() {
        return "right";
    }
}
