package ru.ncedu.ball;

/**
 * This class ContainerImp for testing class BallImp
 * @version 1.0, 15 Deg 2020
 * @author Vladislav Semenovykh
 */
public class ContainerImp implements IContainer {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    /**
     * Constructor - creating a new instance with specific values
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public ContainerImp(int x, int y, int width, int height){
        this.x1 = x;
        this.y1 = y;
        this.x2 = this.x1 + width;
        this.y2 = this.y1 + height;
    }

    /**
     * Method to get field {@link #x1}
     * @return x
     */
    @Override
    public int getX(){
        return this.x1;
    }

    /**
     * Method to get field {@link #y1}
     * @return y
     */
    @Override
    public int getY(){
        return this.y1;
    }

    /**
     * Method to get field {@link #x2}
     * @return  width
     */
    @Override
    public int getWidth(){
        return this.x2;
    }

    /**
     * Method to get field {@link #y2}
     * @return height
     */
    @Override
    public int getHeight(){
        return this.y2;
    }

    /**
     * Method checking ball within the container
     * @return true if ball within the container, otherwise false
     */
    @Override
    public boolean collides(BallImp ball){
        Double radiusBall = (double) ball.getRaadius();
        Double xCenterBall = (double) ball.getX();
        Double yCenterBall = (double) ball.getY();

        /*Ball touch point coordinates*/
        Double xTopTangentBall = xCenterBall;
        Double yTopTangentBall = yCenterBall - radiusBall;

        Double xLeftTangentBall = xCenterBall - radiusBall;
        Double yLeftTangentBall = xCenterBall;

        Double xRightTangentBall = xCenterBall + radiusBall;
        Double yRightTangentBall = yCenterBall;

        Double xDownTangentBall = xCenterBall;
        Double yDownTangentBall = yCenterBall + radiusBall;

        /*Boundary conditions*/
        /*
        boolean Condition = ( ( (xTopTangentBall >= getX()) & (xTopTangentBall <= getWidth()) )
                            & ( (yTopTangentBall >= getY()) & (yTopTangentBall <= getHeight()) )
                            & ( (xLeftTangentBall >= getX()) & (xLeftTangentBall <= getWidth()) )
                            & ( (yLeftTangentBall >= getY()) & (yLeftTangentBall <= getHeight()) )
                            & ( (xRightTangentBall >= getX()) & (xRightTangentBall <= getWidth()) )
                            & ( (yRightTangentBall >= getY()) & (yRightTangentBall <= getHeight()) )
                            & ( (xDownTangentBall >= getX()) & (xDownTangentBall <= getWidth()) )
                            & ( (yDownTangentBall >= getY()) & (yDownTangentBall <= getHeight()) ) );
        */
        boolean Condition = ( ( (xTopTangentBall.compareTo((double)getX()) >= 0) & (xTopTangentBall.compareTo((double)getWidth()) <= 0) )
                            & ( (yTopTangentBall.compareTo((double)getY()) >= 0) & (yTopTangentBall.compareTo((double)getHeight()) <= 0) )
                            & ( (xLeftTangentBall.compareTo((double)getX()) >= 0) & (xLeftTangentBall.compareTo((double)getWidth()) <= 0) )
                            & ( (yLeftTangentBall.compareTo((double)getY()) >= 0) & (yLeftTangentBall.compareTo((double)getHeight()) <= 0) )
                            & ( (xRightTangentBall.compareTo((double)getX()) >= 0) & (xRightTangentBall.compareTo((double)getWidth()) <= 0) )
                            & ( (yRightTangentBall.compareTo((double)getY()) >= 0) & (yRightTangentBall.compareTo((double)getHeight()) <= 0) )
                            & ( (xDownTangentBall.compareTo((double)getX()) >= 0) & (xDownTangentBall.compareTo((double)getWidth()) <= 0) )
                            & ( (yDownTangentBall.compareTo((double)getY()) >= 0) & (yDownTangentBall.compareTo((double)getHeight()) <= 0) ) );

        return (Condition) ? true : false;
    }

    /**
     * String representation
     * @return "Container[({@link #x1}, {@link #y1}), ({@link #x2}, {@link #y2})]"
     */
    @Override
    public String toString() {
        return "Container[(" + this.x1 +
                        ", " + this.y1 +
                       "), " + this.x2 +
                        ", " + this.y2 +
                        ")]";
    }
}
