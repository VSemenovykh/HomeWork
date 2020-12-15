package ru.ncedu.mypolynomial;

import java.util.Arrays;

/**
 * This class MyPolynomialImp
 * @version 1.0, 13 Deg 2020
 * @author Vladislav Semenovykh
 */
public class MyPolynomialImp implements IMyPolynomial{
    private double[] coeffs = null;

    /**
     * Constructor - creating a new instance with specific values
     * @param coeffs
     */
    public MyPolynomialImp(double... coeffs){
        this.coeffs = coeffs;
    }

    /**
     * Method to get degree polynomial
     * @return degree
     */
    @Override
    public int getDegree(){
        return this.coeffs.length-1;
    }

    /**
     * Method to get coeffs {@link #coeffs}
     * @return coeffs polynomial
     */
    public double[] getCoeffs(){
        return this.coeffs;
    }

    /**
     * String representation instance this class
     * @return "Cn * x^n + Cn-1 * x^(n-1) + ... + C0"
     */
    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        int lengthCoeffs = getDegree();

        for(int i = 0; i < lengthCoeffs; i++){
            buffer.append(this.coeffs[lengthCoeffs - i] + "x^" + (lengthCoeffs - i) + " + " );

        }

        buffer.append(this.coeffs[0]);

        return buffer.toString();
    }

    /**
     * Method calculate polynomial
     * @param x
     * @return values polynomial
     */
    @Override
    public double evaluate(double x){
        double res = 0.0;
        int lengthCoeffs = getDegree();

        for(int i = 0; i < lengthCoeffs; i++){
            res +=this.coeffs[lengthCoeffs - i]*Math.pow(x,lengthCoeffs - i);
        }
        res += this.coeffs[0];

        return res;

    }

    /**
     * Method add two polynomials
     * @param right
     * @return new instance
     */
    @Override
    public MyPolynomialImp add(MyPolynomialImp right){
        MyPolynomialImp newPolynomial;

        double[] coeffsThisInstance = new double[getDegree()+1];
        int lengthCoeffsThisInstance = getDegree() + 1;
        int lengthCoeffsRight = right.getDegree() + 1;

        coeffsThisInstance = this.coeffs;

        if(lengthCoeffsRight >= lengthCoeffsThisInstance){
            for (int i=0; i < lengthCoeffsThisInstance; i++){
                right.getCoeffs()[i] += coeffsThisInstance[i];
            }

            newPolynomial = new MyPolynomialImp(right.getCoeffs());
        }else {
            for (int i = 0; i < lengthCoeffsThisInstance; i++) {
                coeffsThisInstance[i] += right.getCoeffs()[i];
            }

            newPolynomial = new MyPolynomialImp(coeffsThisInstance);
        }

        return newPolynomial;
    }

    /**
     * Method multuple two polynomial
     * @param right
     * @return new instance
     */
    @Override
    public MyPolynomialImp multiple(MyPolynomialImp right){
        MyPolynomialImp newPolynomial;

        double[] coeffsThisInstance = new double[getDegree()+1];
        int lengthCoeffsThisInstance = getDegree() + 1;
        int lengthCoeffsRight = right.getDegree() + 1;

        coeffsThisInstance = this.coeffs;

        if(lengthCoeffsRight >= lengthCoeffsThisInstance){
            for (int i=0; i < lengthCoeffsThisInstance; i++){
                right.getCoeffs()[i] *= coeffsThisInstance[i];
            }
            return new MyPolynomialImp(right.getCoeffs());
        }else {
            for (int i = 0; i < lengthCoeffsThisInstance; i++) {
                coeffsThisInstance[i] *= right.getCoeffs()[i];
            }
            return new MyPolynomialImp(coeffsThisInstance);
        }
    }
}
