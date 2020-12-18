package ru.ncedu.mycomplex;

import java.util.Objects;

import static java.lang.Math.*;
/**
 * This class MyComplex
 * @version 1.0, 11 Deg 2020
 * @author Vladislav Semenovykh
 */
public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    /**
     * Constructor - creating a new instance
     * @see #MyComplex(double, double)
     */
    public MyComplex(){}

    /**
     * Constructor - creating a new instance with specific values
     * @param real
     * @param imag
     * @see #MyComplex()
     */
    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    /**
     * Method to get values field {@link #real}
     * @return real
     */
    public double getReal(){
        return this.real;
    }

    /**
     * Procedure for determination field {@link #real}
     * @param real
     */
    public void setReal(double real){
        this.real = real;
    }

    /**
     * Method to get values field {@link #imag}
     * @return imag
     */
    public double getImag(){
        return this.imag;
    }

    /**
     * Procedure for determination field {@link #imag}
     * @param imag
     */
    public void setImag(double imag){
        this.imag = imag;
    }

    /**
     * Procedure for determination field {@link #real} and {@link #imag}
     * @param real
     * @param imag
     */
    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    /**
     * String representation instance this class
     * @return if conjugate  "({@link #real} - {@link #imag}*i)",  otherwise "({@link #real} - {@link #imag}*i)"
     */
    public String toString() {
        return (this.imag >= 0) ? ("(" + real + "+" + imag + "i)") : ("(" + real + imag + "i)");

    }

    /**
     * Method of checking for {@link #real}
     * @return true if real <> 0, otherwise false
     */
    public boolean isReal(){
        return  (this.real != 0) ? true : false;
    }

    /**
     * Method of checking for {@link #imag}
     * @return true if imag <> 0, otherwise false
     */
    public boolean isImaginary(){
        return (this.imag !=0) ? true : false;
    }

    /**
     * Method of comparing two complex
     * @param real
     * @param imag
     * @return true if this real and imag == real and imag, otherwise false
     */
    public boolean equals(double real, double imag) {
        return (this.equals(new MyComplex(real, imag)));
    }

    /**
     * Method of comparing two instances this instance and new instance
     * @param another
     * @return true if this instance == instance another, otherwise false
     */
    public boolean equals(MyComplex another) {
        return ((this.real != another.getReal()) | (this.imag != another.getImag())) ? false : true;
    }


    /**
     * Method to get values module complex number
     * @return magnitude
     */
    public double magnitude(){
        return sqrt(pow(this.real,2) + pow(this.imag,2));
    }

    /**
     * Method to get values argument complex number in radian
     * @return argument
     */
    public double argument(){
        return atan(this.imag/this.real);
    }

    /**
     * Method add complex numbers
     * @param right
     * @return this instance
     */
    public MyComplex add(MyComplex right){
        this.real += right.getReal();
        this.imag += right.getImag();
        return this;
    }

    /**
     * Method new add complex numbers
     * @param right
     * @return new instance
     */
    public MyComplex addNew(MyComplex right){
        return new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
    }

    /**
     * Method subcract two complex numbers
     * @param right
     * @return this instance
     */
    public MyComplex subcract(MyComplex right){
        this.real -= right.getReal();
        this.imag -= right.getImag();
        return this;
    }

    /**
     * Method new subcract complex numbers
     * @param right
     * @return new instance
     */
    public MyComplex subractNew(MyComplex right){
        return  new MyComplex( (this.real - right.getReal()), (this.imag - right.getImag()) );
    }

    /**
     * Method multiply two complex numbers
     * @param right
     * @return this instance
     */
    public MyComplex multiply(MyComplex right){
        this.real *= right.getReal();
        this.imag *= right.getImag();
        return this;
    }

    /**
     * Method divide two complex numbers
     * @param right
     * @return this instance
     */
    public MyComplex divide(MyComplex right){
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
     public MyComplex conjugate(){
        return new MyComplex(real, -imag);
    }
}
