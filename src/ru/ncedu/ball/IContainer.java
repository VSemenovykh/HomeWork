package ru.ncedu.ball;

/**
 * This interface IContainer
 * @version 1.0, 15 Deg 2020
 * @author Vladislav Semenovykh
 */
public interface IContainer{
    int getX();

    int getY();

    int getWidth();

    int getHeight();

    boolean collides(BallImp ball);

    @Override
    String toString();
}