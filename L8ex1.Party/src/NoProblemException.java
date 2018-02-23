public class NoProblemException extends RuntimeException {

    public String message;

    public NoProblemException(String message) {
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}