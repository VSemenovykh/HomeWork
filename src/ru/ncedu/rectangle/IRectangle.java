package ru.ncedu.rectangle;

/**
 * This class IRectangle
 * @version 1.0, 10 Deg 2020
 * @author Vladislav Semenovykh
 */
public interface IRectangle{
    float getLength();

    void setLength(float length);

    float getWidth();

    void setWidth(float width);

    double getArea();

    double gerPerimeter();

    @Override
    String toString() ;

}