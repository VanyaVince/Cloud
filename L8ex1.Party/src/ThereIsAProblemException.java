public class ThereIsAProblemException extends Exception {

    public String message;
    public ThereIsAProblemException (String message){
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}