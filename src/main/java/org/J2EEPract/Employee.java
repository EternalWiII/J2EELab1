package org.J2EEPract;

public class Employee {
    private int id;
    private static int nextId;
    private String name;
    private String surname;
    private double salary;

    public Employee(String name, String surname, double salary)
            throws FieldLengthLimitException, IncorrectSalaryException
    {
        setSalary(salary);
        setName(name);
        setSurname(surname);
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) throws FieldLengthLimitException{
        if(name.length() > 16){
            throw new FieldLengthLimitException("Symbols in name exceed 16");
        } else {
            this.name = name;
        }
    }

    public void setSurname(String surname) throws FieldLengthLimitException{
        if(surname.length() > 16) {
            throw new FieldLengthLimitException("Symbols in surname exceed 16");
        } else {
            this.surname = surname;
        }
    }

    public void setSalary(double salary) throws IncorrectSalaryException{
        if(salary < 0) {
            throw new IncorrectSalaryException("Salary field can't have a negative value");
        } else {
            this.salary = salary;
        }
    }
}
