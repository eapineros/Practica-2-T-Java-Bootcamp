package ejercicio1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Password {

    private Pattern pattern;
    private String password;

    public Password(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    public void setValue(String pwd) {
        if(this.pattern == null) {
            throw new RuntimeException("Definir una expresión regular");
        }
        Matcher matcher = this.pattern.matcher(pwd);
        if (matcher.find()) {
            this.password = pwd;
            System.out.println("Contraseña Cambiada");
        } else {
            throw new PatternSyntaxException("La contraseña no coincide con la expresión regular", this.pattern.toString(), -1);
        }
    }
}
