package ru.ncedu.mypoint;

import static java.lang.Math.*;
/**
 * This class MyPoint
 * @version 1.0, 10 Deg 2020
 * @author Vladislav Semenovykh
 */
public class MyPoint {
    private double x = 0;
    private double y = 0;

    /**
     * Constructor - creating a new instance
     * @see #MyPoint(double, double)
     * */
    public MyPoint(){}

    /**
     * Constructor - creating a new instance with specific values
     * @param x
     * @param y
     * @see #MyPoint()
     */
    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * Method to get field {@link #x}
     * @return x
     */
    public double getX(){
        return this.x;
    }

    /**
     * Procedure for determination field {@link #x}
     * @param x
     */
    public void setX(double x){
        this.x = x;
    }

    /**
     * Method to get field {@link #y}
     * @return y
     */
    public double getY(){
        return this.y;
    }

    /**
     * Procedure for determination field {@link #y}
     * @param y
     */
    public void setY(double y){
        this.y = y;
    }

    /**
     * Method to get an massiv of two numbers {X,Y}
     * @return array
     */
    public double[] getXY(){
        double[] XY = new double[2];
        XY[0] = this.x;
        XY[1] = this.y;
        return XY;
    }

    /**
     * Procedure for determination field {@link #x} and {@link #y}
     * @param x
     * @param y
     * */
    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     * String representation instance this class
     * @return "({@link #x}, {@link #y})"
     */
    @Override
    public String toString() {
        return "(" + x +"," + y + ")";
    }

    /**
     * Method to get the distance between two coordinates
     * @param x
     * @param y
     * return distance
     */
    public double distance(double x, double y){
        return sqrt(pow(x - this.x , 2) + pow(y - this.y , 2));
    }

    /* Method to get distance between two point
     * @param another
     * @return distance
     */
    public double distance(MyPoint another){
        return sqrt(pow((another.getX() - this.x), 2) +  pow((another.getY() - this.y), 2));
    }

    /**
     * Method to get distance this point
     * @return distance (0,0)
     */
    public double distance(){
        return sqrt(pow(getX() - this.x, 2) + pow(getY() - this.y, 2));
    }
}
