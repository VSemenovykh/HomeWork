package ru.ncedu.mypolynomial;

/**
 * This interface IMyPolynomial
 * @version 1.0, 13 Deg 2020
 * @author Vladislav Semenovykh
 */
public interface IMyPolynomial{
    int getDegree();

    double[] getCoeffs();

    @Override
    String toString();

    double evaluate(double x);

    MyPolynomialImp add(MyPolynomialImp right);

    MyPolynomialImp multiple(MyPolynomialImp right);
}