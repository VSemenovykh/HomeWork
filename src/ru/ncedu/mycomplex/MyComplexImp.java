package ru.ncedu.mycomplex;

/**
 * This class MyComplexImp
 * @version 1.0, 11 Deg 2020
 * @author Vladislav Semenovykh
 */
public class MyComplexImp implements IMyComplex {
    MyComplexImp thisComplex;
    private double real = 0.0;
    private double imag = 0.0;

    /**
     * Constructor - creating a new instance
     * @see #MyComplexImp(double, double)
     */
    public MyComplexImp(){}

    /**
     * Constructor - creating a new instance with specific values
     * @param real
     * @param imag
     * @see #MyComplexImp()
     */
    public MyComplexImp(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    /**
     * Method to get values field {@link #real}
     * @return real
     */
    @Override
    public double getReal(){
        return this.real;
    }

    /**
     * Procedure for determination field {@link #real}
     * @param real
     */
    @Override
    public void setReal(double real){
        this.real = real;
    }

    /**
     * Method to get values field {@link #imag}
     * @return imag
     */
    @Override
    public double getImag(){
        return this.imag;
    }

    /**
     * Procedure for determination field {@link #imag}
     * @param imag
     */
    @Override
    public void setImag(double imag){
        this.imag = imag;
    }

    /**
     * Procedure for determination field {@link #real} and {@link #imag}
     * @param real
     * @param imag
     */
    @Override
    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    /**
     * String representation instance this class
     * @return if conjugate  "({@link #real} - {@link #imag}*i)",  otherwise "({@link #real} - {@link #imag}*i)"
     */
    @Override
    public String toString() {
        boolean condition = ( this.imag >= 0 );

        return condition ? ("(" + real + "+" + imag + "i)") : ("(" + real + imag + "i)");

    }

    /**
     * Method of checking for {@link #real}
     * @return true if real <> 0, otherwise false
     */
    @Override
    public boolean isReal(){
        boolean condition = (this.real != 0);

        return  condition ? true : false;
    }

    /**
     * Method of checking for {@link #imag}
     * @return true if imag <> 0, otherwise false
     */
    @Override
    public boolean isImaginary(){
        boolean condition = (this.imag !=0);

        return condition ? true : false;
    }

    /**
     * Method of comparing two complex
     * @param real
     * @param imag
     * @return true if this real and imag == real and imag, otherwise false
     */
    //@Override
    public boolean equals(double real, double imag) {
        boolean condition = ( (this.real == real) & (this.imag == imag) );

        return condition ? true : false;
    }

    /**
     * Method of comparing two instances this instance and new instance
     * @param another
     * @return true if this instance == instance another, otherwise false
     */
    @Override
    public boolean equals(MyComplexImp another){
        boolean condition = ( (this.real == another.getReal()) & (this.imag == another.getImag()) );

        return condition ? true : false;
    }

    /**
     * Method to get values module complex number
     * @return magnitude
     */
    @Override
    public double magnitude(){
        double sqaReal = Math.pow(this.real,2);
        double sqaImag = Math.pow(this.imag,2);

        return Math.sqrt(sqaReal + sqaImag);
    }

    /**
     * Method to get values argument complex number in radian
     * @return argument
     */
    @Override
    public double argument(){
        double argTg = Math.atan(this.imag/this.real);

        return argTg;
    }

    /**
     * Method add complex numbers
     * @param right
     * @return this instance
     */
    @Override
    public MyComplexImp add(MyComplexImp right){
        this.real += right.getReal();
        this.imag += right.getImag();

        return this;
    }

    /**
     * Method new add complex numbers
     * @param right
     * @return new instance
     */
    @Override
    public MyComplexImp addNew(MyComplexImp right){
        MyComplexImp newComplex;

        double newReal = this.real + right.getReal();
        double newImag = this.imag + right.getImag();

        newComplex = new MyComplexImp(newReal, newImag);
        return newComplex;
    }

    /**
     * Method subcract two complex numbers
     * @param right
     * @return this instance
     */
    @Override
    public MyComplexImp subcract(MyComplexImp right){
        this.real -= right.getReal();
        this.imag -= right.getImag();

        return this;
    }

    /**
     * Method new subcract complex numbers
     * @param right
     * @return new instance
     */
    @Override
    public MyComplexImp subractNew(MyComplexImp right){
        MyComplexImp newComplex;

        double newReal = this.real - right.getReal();
        double newImag = this.imag - right.getImag();

        newComplex = new MyComplexImp(newReal, newImag);

        return newComplex;
    }

    /**
     * Method multiply two complex numbers
     * @param right
     * @return this instance
     */
    @Override
    public MyComplexImp multiply(MyComplexImp right){
        this.real *= right.getReal();
        this.imag *= right.getImag();

        return this;
    }

    /**
     * Method divide two complex numbers
     * @param right
     * @return this instance
     */
    @Override
    public MyComplexImp divide(MyComplexImp right){
        if(right.getReal() == 0 || right.getImag() == 0){
            throw new ArithmeticException();
        }
        this.real = right.getReal()/this.real ;
        this.imag = right.getImag()/this.imag ;

        return this;
    }

    /**
     * Method conjugate
     * @return new instance
     */
    @Override
    public MyComplexImp conjugate(){
        return (this.imag >= 0) ? new MyComplexImp(real, -imag) : new MyComplexImp(real, -imag);
    }
}
