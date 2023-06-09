package Buoi6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static final String CLASSNAME_REGEX = ("^[CAP]+\\d{4}+[GHIK]");
    public ValidateClassName(){}
    public boolean validate (String regex){
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
