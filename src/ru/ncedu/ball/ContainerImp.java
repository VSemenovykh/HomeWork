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
        double radiusBall = (double) ball.getRaadius();
        double xCenterBall = (double) ball.getX();
        double yCenterBall = (double) ball.getY();

        /*Ball touch point coordinates*/
        double xTopTangentBall = xCenterBall;
        double yTopTangentBall = yCenterBall - radiusBall;

        double xLeftTangentBall = xCenterBall - radiusBall;
        double yLeftTangentBall = xCenterBall;

        double xRightTangentBall = xCenterBall + radiusBall;
        double yRightTangentBall = yCenterBall;

        double xDownTangentBall = xCenterBall;
        double yDownTangentBall = yCenterBall + radiusBall;

        /*Boundary conditions*/
        boolean Condition = ( ( (xTopTangentBall >= getX()) & (xTopTangentBall <= getWidth()) )
                            & ( (yTopTangentBall >= getY()) & (yTopTangentBall <= getHeight()) )
                            & ( (xLeftTangentBall >= getX()) & (xLeftTangentBall <= getWidth()) )
                            & ( (yLeftTangentBall >= getY()) & (yLeftTangentBall <= getHeight()) )
                            & ( (xRightTangentBall >= getX()) & (xRightTangentBall <= getWidth()) )
                            & ( (yRightTangentBall >= getY()) & (yRightTangentBall <= getHeight()) )
                            & ( (xDownTangentBall >= getX()) & (xDownTangentBall <= getWidth()) )
                            & ( (yDownTangentBall >= getY()) & (yDownTangentBall <= getHeight()) ) );

        return (Condition) ? true :false;
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
