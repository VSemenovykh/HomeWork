package ru.ncedu.ball;

/**
 * This class BallImp
 * @version 1.0, 15 Deg 2020
 * @author Vladislav Semenovykh
 */
public class BallImp implements IBall {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    /**
     * Constructor - creating a new instance with specific values
     * @param x
     * @param y
     * @param radius
     * @param speed
     * @param direction
     */
    public BallImp (float x, float y, int radius, int speed, int direction){
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = (float)(speed*Math.cos(direction));
        this.yDelta = (float)(speed*Math.sin(direction));
    }

    /**
     * Method to get values field {@link #x}
     * @return x
     */
    @Override
    public float getX(){
        return this.x;
    }

    /**
     * Procedure for determination field {@link #x}
     * @parem x
     */
    public void setX(float x){
        this.x = x;
    }

    /**
     * Method to get values field {@link #y}
     * @return y
     */
    @Override
    public float getY() {
        return this.y;
    }

    /**
     * Procedure for determination field {@link #y}
     * @param y
     */
    @Override
    public void setY(float y){
        this.y = y;
    }

    /**
     * Method to get values radius {@link #radius}
     * @return radius
     */
    @Override
    public int getRaadius(){
        return this.radius;
    }

    /**
     * Procedure for determination producer {@link #radius}
     * @param radius
     */
    @Override
    public void setRadius(int radius){
        this.radius = radius;
    }

    /**
     * Method to get values xDelta {@link #xDelta}
     * @return delataX
     */
    @Override
    public float getDeltaX(){
        return this.xDelta;
    }

    /**
     * Procedure for determination field {@link #xDelta}
     * @param xDelta
     */
    @Override
    public void setxDelta(float xDelta){
        this.xDelta = xDelta;
    }

    /**
     * Method to get values yDelta {@link #yDelta}
     * @return deltaY
     */
    @Override
    public float getDeltaY(){
        return this.yDelta;
    }

    /**
     * Procedure for determination field {@link #yDelta}
     * @param yDelta
     */
    @Override
    public void setyDelta(float yDelta){
        this.yDelta = yDelta;
    }

    /**
     * Method move the ball one step
     * @return x + deltaX Move the ball one step deltaX
     * @return y + deltay Move the ball one step deltaY
     */
    @Override
    public void move(){
        this.x += getDeltaX();
        this.y += getDeltaY();
    }

    /**
     * Method reverses the direction of horizontal movement of the ball
     * @return deltaX = -deltaX
     */
    @Override
    public void reflectHorizontal(){
        this.xDelta = -getDeltaX();
    }

    /**
     * Method reverses the direction of vertical movement of the ball
     * @return deltaY = -deltaY
     */
    @Override
    public void refletVertical(){
        this.yDelta = -getDeltaY();
    }

    /**
     * String representation instance this class
     * @return "Ball[({@link #x},{@link #y}), speed=({@link #xDelta}, {@link #yDelta})]"
     */
    @Override
    public String toString() {
        return "Ball[(" + this.x +
                    "," + this.y + ")" +
            ", speed=(" + this.xDelta +
                    "," + this.yDelta + ")]";
    }
}
