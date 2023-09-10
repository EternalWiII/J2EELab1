package org.J2EEPract;

public class IncorrectSalaryException extends Exception{
    public IncorrectSalaryException() {
        super();
    }

    public IncorrectSalaryException(String message) {
        super(message);
    }

    public IncorrectSalaryException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectSalaryException(Throwable cause) {
        super(cause);
    }
}
