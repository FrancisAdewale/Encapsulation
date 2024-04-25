package org.example;

public class Car extends Vehicle implements Driveable{
    @Override
    public void move() {
        //System.out.println(this.getClass().getSimpleName() + " is being driven!");

    }

    @Override
    public void drive() {
        System.out.println(this.getClass().getSimpleName() + " is being driven!");

    }

    @Override
    public int getSpeed() {
        return 8;
    }

    @Override
    public int[] getPosition() {
        return new int[]{3,1};

    }

    @Override
    public String getDirection() {
        return "";
    }
}
