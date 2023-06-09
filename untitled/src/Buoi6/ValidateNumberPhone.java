package Buoi6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    public static final String NUMBERPHONE_REGEX = ("\\(\\d{2}\\)-\\(0\\d{9}\\)");

    public ValidateNumberPhone(){
    }
    public boolean validate (String regex){
        Pattern pattern = Pattern.compile(NUMBERPHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
