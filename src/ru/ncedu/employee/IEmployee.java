package ru.ncedu.employee;

/**
 * This interface  IEmployee
 * @version 1.0, 10 Deg 2020
 * @author Vladislav Semenovykh
 */
public interface IEmployee{
    int getID();

    String getFirstName();

    String getLastName();

    String getName();

    int getSalary();

    void setSalary(int salary);

    int getAnnualSalary();

    int raiseSalary(int percent);

    @Override
    String toString();

}