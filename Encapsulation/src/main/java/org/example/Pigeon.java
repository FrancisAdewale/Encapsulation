package org.example;

public class Pigeon extends Bird{
    @Override
    public void makeSound() {

    }

    @Override
    public int getSpeed() {
        return 30;
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
