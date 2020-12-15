package ru.ncedu.mypoint;

/**
 * This class MyPointImp
 * @version 1.0, 10 Deg 2020
 * @author Vladislav Semenovykh
 */
public class MyPointImp implements IMyPoint {
    private int x = 0;
    private int y = 0;

    /**
     * Constructor - creating a new instance
     * @see #MyPointImp(int, int)
     * */
    public MyPointImp(){}

    /**
     * Constructor - creating a new instance with specific values
     * @param x
     * @param y
     * @see #MyPointImp()
     */
    public MyPointImp(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Method to get field {@link #x}
     * @return x
     */
    @Override
    public int getX(){
        return this.x;
    }

    /**
     * Procedure for determination field {@link #x}
     * @param x
     */
    @Override
    public void setX(int x){
        this.x = x;
    }

    /**
     * Method to get field {@link #y}
     * @return y
     */
    @Override
    public int getY(){
        return this.y;
    }

    /**
     * Procedure for determination field {@link #y}
     * @param y
     */
    @Override
    public void setY(int y){
        this.y = y;
    }

    /**
     * Method to get an massiv of two numbers {X,Y}
     * @return array
     */
    @Override
    public int[] getXY(){
        int[] XY = new int[2];
        XY[0] = this.x;
        XY[1] = this.y;

        return XY;
    }

    /**
     * Procedure for determination field {@link #x} and {@link #y}
     * @param x
     * @param y
     * */
    public void setXY(int x, int y){
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
    @Override
    public double distance(int x, int y){
        double sqaX = (double) Math.pow(x - this.x , 2);
        double sqaY = (double) Math.pow(y - this.y , 2);

        return Math.sqrt(sqaX + sqaY);
    }

    /* Method to get distance between two point
     * @param another
     * @return distance
     */
    @Override
    public double distance(MyPointImp another){
        double sqaX ;
        double sqaY;

        sqaX = (double) Math.pow((another.getX() - this.x), 2);
        sqaY = (double) Math.pow((another.getY() - this.y), 2);

        return Math.sqrt(sqaX + sqaY);
    }

    /**
     * Method to get distance this point
     * @return distance (0,0)
     */
    @Override
    public double distance(){
        double sqaX;
        double sqaY;

        sqaX = (double) Math.pow(getX() - this.x, 2);
        sqaY = (double) Math.pow(getY() - this.y, 2);

        return Math.sqrt(sqaX + sqaY);
    }
}
