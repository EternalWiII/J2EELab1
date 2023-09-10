package org.J2EEPract;

public class J2EEPract {
    public static void main(String[] args) {
        try {
            Employee e = new Employee("Dmytrii", "Maistrenko", 100);
        } catch (FieldLengthLimitException e1) {
            System.out.println(e1.getMessage());
        } catch (IncorrectSalaryException e2) {
            System.out.println(e2.getMessage());
        }
    }
}