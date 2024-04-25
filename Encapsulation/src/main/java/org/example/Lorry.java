package org.example;

public class Lorry extends Vehicle implements Driveable{
    @Override
    public void drive() {
        System.out.println(this.getClass().getSimpleName() + " is being driven! ");

    }

    @Override
    public void move() {

    }

    @Override
    public int getSpeed() {
        return 4;
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
