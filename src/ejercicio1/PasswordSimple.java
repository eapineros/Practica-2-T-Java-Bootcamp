package ejercicio1;

public class PasswordSimple extends Password{

    private static final String REGEX = "[1-4]";

    public PasswordSimple() {
        super(REGEX);
    }
}
