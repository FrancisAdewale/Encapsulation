package org.example;

public interface Swimmable extends Moveable {
    void swim();

    @Override
    void tick();
}
