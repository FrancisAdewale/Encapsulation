package org.example;

public interface Flyable extends Moveable{
    void fly();

    @Override
    void tick();
}
