package ru.ncedu.circle;

/**
 * This class CircleImp
 * @version 1.0, 10 Deg 2020
 * @author Vladislav Semenovykh
 */
public class CircleImp implements ICircle {
    private double radius;
    private String color;

    /**
     * Constructor - creating a new instance with specific values
     * @see #CircleImp(double)
     */
    public CircleImp() {

    }

    /**
     * Constructor - creating a new instance with specific values
     * @param radius
     * @see #CircleImp(double, String)
     */
    public CircleImp(double radius) {
        this.radius = radius;
    }

    /**
     * Constructor - creating a new instance with specific values
     * @param radius
     * @param color
     * @see #CircleImp()
     */
    public CircleImp(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Method to get field {@link #radius}
     * @return radius
     */
    @Override
    public double getRadius(){
        return this.radius;
    }

    /**
     * Method to get field {@link #color}
     * @return color
     */
    @Override
    public String getColor(){ return this.color; }

    /**
     * Procedure for determination field {@link #radius}
     * @param radius
     */
    @Override
    public void setRadius(double radius){
        this.radius = radius;
    }

    /**
     * Procedure for determination field {@link #color}
     * @param color
     */
    @Override
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
    @Override
    public double getArea(){
        double area = (Math.PI)*(Math.pow(this.radius, 2));
        return  area;
    }
}
