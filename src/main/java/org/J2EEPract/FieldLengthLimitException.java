package org.J2EEPract;

public class FieldLengthLimitException extends Exception{
    public FieldLengthLimitException() {
    }

    public FieldLengthLimitException(String message) {
        super(message);
    }

    public FieldLengthLimitException(String message, Throwable cause) {
        super(message, cause);
    }

    public FieldLengthLimitException(Throwable cause) {
        super(cause);
    }
}
