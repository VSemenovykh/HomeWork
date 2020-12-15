package ru.ncedu.book;

/**
 * This interface IBook
 * @version 1.0, 10 Deg 2020
 * @author Vladislav Semenovykh
 */
public interface IBook{
    String getName();

    double getPrice();

    void setPrice(double price);

    int getQry();

    void setQry(int qry);

    @Override
    String toString();

    String getAuthorNames();
}