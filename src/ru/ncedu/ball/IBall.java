package ru.ncedu.ball;

/**
 * This interface IBall
 * @version 1.0, 15 Deg 2020
 * @author Vladislav Semenovykh
 */
public interface IBall{
    float getX();

    void setX(float x);

    float getY();

    void setY(float y);

    int getRaadius();

    void setRadius(int radius);

    float getDeltaX();

    void setxDelta(float xDelta);

    float getDeltaY();

    void setyDelta(float yDelta);

    void move();

    void reflectHorizontal();

    void refletVertical();

    @Override
    String toString();

}
