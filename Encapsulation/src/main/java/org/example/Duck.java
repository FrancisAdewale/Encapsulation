package org.example;

public class Duck extends Bird implements Swimmable{
    @Override
    public void makeSound() {

    }

    @Override
    public void swim() {
        System.out.println(this.getClass().getSimpleName() + " is swimming!");

    }

    @Override
    public int getSpeed() {
        return 20;
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
