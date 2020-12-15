package ru.ncedu.circle;

/**
 * This interface ICircle
 * @version 1.0, 10 Deg 2020
 * @author Vladislav Semenovykh
 */
public interface ICircle{
    double getRadius();

    String getColor();

    void setRadius(double radius);

    void setColor(String color);

    @Override
    String toString();

    double getArea();
}