package ru.ncedu.rectangle;

/**
 * This class RectangleImp
 * @version 1.0, 10 Deg 2020
 * @author Vladislav Semenovykh
 */
public class RectangleImp implements  IRectangle{
    private float length = 1.0f;
    private float width = 1.0f;

    /**
     * Constructor - creating a new instance
     * @see #RectangleImp(float, float)
     */
    public RectangleImp(){

    }

    /**
     * Constructor - creating a new instance with specific values
     * @param length
     * @param width
     */
    public RectangleImp(float length, float width){
        this.length = length;
        this.width = width;

    }

    /**
     * Method to get field {@link #length}
     * @return length
     */
    @Override
    public float getLength(){
        return this.length;
    }

    /**
     * Procedure for determination field {@link #length}
     * @param length
     */
    @Override
    public void setLength(float length){
        this.length = length;
    }

    /**
     * Method to get field {@link #width}
     * @return width
     */
    @Override
    public float getWidth(){
        return this.width;
    }

    /**
     * Procedure for determination field {@link #width}
     * @param width
     */
    @Override
    public void setWidth(float width){
        this.width = width;
    }

    /**
     * Method to get area rectangle
     * @return area
     */
    @Override
    public double getArea(){
        return this.length*this.width;
    }

    /**
     * Method to get perimeter rectangle
     * @return perimeter
     */
    @Override
    public double gerPerimeter(){
        return this.width+this.length;
    }

    /**
     * String representation instance this class
     * @return "Recrangle[length={@link #length}, width={@link #width}]"
     */
    @Override
    public String toString() {
        return "Rectangle[" +
                          "length=" + length +
                        ", width=" + width +
                         "]";
    }
}
