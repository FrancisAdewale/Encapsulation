package org.example;

public interface Moveable {

    int getSpeed();

    int[] getPosition();
    String getDirection();
    void tick();
}
