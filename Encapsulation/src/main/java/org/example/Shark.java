package org.example;

public class Shark extends Fish implements Swimmable{

    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " is swimming!");
    }

    @Override
    public int getSpeed() {
        return 25;
    }

    @Override
    public int[] getPosition() {
        return new int[]{3,1};
    }

    @Override
    public String getDirection() {
        return super.getDirection();
    }
}
