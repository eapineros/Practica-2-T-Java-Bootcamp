package ejercicio1;

public class PasswordFuerte extends Password{

    private static final String REGEX = "[A-C1-6\\s]";

    public PasswordFuerte() {
        super(REGEX);
    }
}

