package org.example;

public interface Driveable extends Moveable{
    void drive();

    @Override
    void tick();
}
