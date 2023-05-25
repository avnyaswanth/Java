package main.exceptions;

import java.util.Objects;

public class BadRequestException extends RuntimeException {
    private String message;
    private ErrorMsg errorMsg;


    public BadRequestException() {
        super();
    }

    public BadRequestException(String message, ErrorMsg errorMsg) {
        super(message);
        this.message = message;
        this.errorMsg = errorMsg;
    }

    @Override
    public String toString() {
        return "BadRequestException{" +
                "message='" + message + '\'' +
                ", errorMsg=" + errorMsg +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BadRequestException that = (BadRequestException) o;
        return Objects.equals(message, that.message) && Objects.equals(errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, errorMsg);
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorMsg getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(ErrorMsg errorMsg) {
        this.errorMsg = errorMsg;
    }
}
