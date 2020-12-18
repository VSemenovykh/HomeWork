package ru.ncedu.circle;

import static java.lang.Math.*;
/**
 * This class Circle
 * @version 1.0, 10 Deg 2020
 * @author Vladislav Semenovykh
 */
public class Circle{
    private double radius;
    private String color;

    /**
     * Constructor - creating a new instance with specific values
     * @see #Circle(double)
     */
    public Circle() {

    }

    /**
     * Constructor - creating a new instance with specific values
     * @param radius
     * @see #Circle(double, String)
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor - creating a new instance with specific values
     * @param radius
     * @param color
     * @see #Circle()
     */
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Method to get field {@link #radius}
     * @return radius
     */
    public double getRadius(){
        return this.radius;
    }

    /**
     * Method to get field {@link #color}
     * @return color
     */
    public String getColor(){ return this.color; }

    /**
     * Procedure for determination field {@link #radius}
     * @param radius
     */
    public void setRadius(double radius){
        this.radius = radius;
    }

    /**
     * Procedure for determination field {@link #color}
     * @param color
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     * String representation instance this class
     * @return "Circle[radius={@link #radius}, color={@link #color}]"
     */
    @Override
    public String toString() {
        return "Circle[" +
                       "radius=" + radius +
                     ", color='" + color + '\'' +
                       "]";
    }

    /**
     * Method to get area circle
     * @return area
     */
    public double getArea(){
        return  PI * pow(this.radius, 2);
    }
}
