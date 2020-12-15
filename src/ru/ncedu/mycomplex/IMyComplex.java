package ru.ncedu.mycomplex;

/**
 * This interface IMyComplex
 * @version 1.0, 11 Deg 2020
 * @author Vladislav Semenovykh
 */
public interface IMyComplex{
    double getReal();

    void setReal(double real);

    double getImag();

    void setImag(double imag);

    void setValue(double real, double imag);

    @Override
    String toString();

    boolean isReal();

    boolean isImaginary();

    boolean equals(double real, double imag);

    boolean equals(MyComplexImp another);

    double magnitude();

    double argument();

    MyComplexImp add(MyComplexImp right);

    MyComplexImp addNew(MyComplexImp right);

    MyComplexImp subcract(MyComplexImp right);

    MyComplexImp subractNew(MyComplexImp right);

    MyComplexImp multiply(MyComplexImp right);

    MyComplexImp divide(MyComplexImp right);

    MyComplexImp conjugate();
}