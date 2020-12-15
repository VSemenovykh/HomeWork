package ru.ncedu.employee;

/**
 * This class  EmployeeImp
 * @version 1.0, 10 Deg 2020
 * @author Vladislav Semenovykh
 */
public class EmployeeImp implements IEmployee {
    private int id ;
    private String firstName;
    private String lastName ;
    private int salary;

    /**
     * Constructor - creating a new instance with specific values
     * @param id
     * @param firstName
     * @param lastName
     * @param salary
     */
    public  EmployeeImp(int id, String firstName, String lastName, int salary){
        this.id =id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    /**
     * Method to get field {@link #id}
     * @return id
     */
    @Override
    public int getID(){
        return this.id;
    }

    /**
     * Method to get field {@link #firstName}
     * @return firstName
     */
    @Override
    public String getFirstName(){
        return  this.firstName;
    }

    /**
     * Method to get field {@link #lastName}
     * @return lastName
     */
    @Override
    public String getLastName(){
        return this.lastName;
    }

    /**
     * Method to get values full name
     * @return "{@link #firstName} {@link #lastName}"
     */
    @Override
    public String getName(){
        return this.firstName+" "+this.lastName;
    }

    /**
     * Method to get field {@link #salary}
     * @return salary
     */
    @Override
    public int getSalary(){
        return this.salary;
    }

    /**
     * Procedure for determination field {@link #salary}
     * @param salary
     */
    @Override
    public void setSalary(int salary){
        this.salary = salary;
    }

    /**
     * Method to get  annual Salary
     * @return salary*12
     */
    @Override
    public int getAnnualSalary(){
        int annualSalary;
        annualSalary = this.salary*12;

        return  annualSalary;
    }

    /**
     * Method to get  raise Salary
     * @return percent
     */
    @Override
    public int raiseSalary(int percent){
        double salary = (double)this.salary;
        double raiseSalary = salary *(1.0 + (((double)percent)/100));

        return (int)raiseSalary;
    }

    /**
     * String representation instance this class
     * @return "Employee[id={@link #id}, name={@link #getName()}, salary={@link #salary}]"
     */
    @Override
    public String toString() {
        return "Employee[" +
                         "id=" + id +
                       ", firstName='" + firstName + '\'' +
                       ", lastName='" + lastName + '\'' +
                       ", salary=" + salary +
                       ']';
    }
}
