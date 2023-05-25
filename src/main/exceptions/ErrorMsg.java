package main.exceptions;


public enum ErrorMsg {

    LOWER_LENGTH("Length less than 5 characters", false),
    HIGHER_LENGTH("Length greater than 10 characters", false),
    EMPTY_NAME("Name shouldn't be empty", false);

    private final String message;
    private final boolean retry;

    @Override
    public String toString() {
        return "ErrorMsg{" +
                "message='" + message + '\'' +
                ", retry=" + retry +
                '}';
    }

    ErrorMsg(String message, boolean retry) {
        this.message = message;
        this.retry = retry;
    }
}
