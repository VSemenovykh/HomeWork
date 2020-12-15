package ru.ncedu.mypoint;

/**
 * This interface IMyPoint
 * @version 1.0, 10 Deg 2020
 * @author Vladislav Semenovykh
 */
public interface IMyPoint{
    int getX();

    void setX(int x);

    int getY();

    void setY(int y);

    int[] getXY();

    void setXY(int x, int y);

    @Override
    String toString();

    double distance(int x, int y);

    double distance(MyPointImp another);

    double distance();
}