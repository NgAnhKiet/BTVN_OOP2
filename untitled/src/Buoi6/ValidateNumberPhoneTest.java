package Buoi6;

public class ValidateNumberPhoneTest {
    private static  ValidateNumberPhone validateNumberPhone;
    private static final String [] validNumberPhone = new String[]{"(84)-(0978489648)"};
    private static final String [] inValidNumberPhone = new String[]{"(a8)-(22222222)" , "(84)-(22b22222)" , "(84)-(9978489648)"};

    public static void main(String[] args) {
        validateNumberPhone = new ValidateNumberPhone();
        for (String numberPhone : validNumberPhone){
            boolean isvalid =  validateNumberPhone.validate(numberPhone);
            System.out.println("Số điện thoại hợp lệ: " + numberPhone + " trạng thái: " + isvalid);
        }
        for (String numberPhone : inValidNumberPhone){
            boolean isvalid =  validateNumberPhone.validate(numberPhone);
            System.out.println("Số điện thoại không hợp lệ: " + numberPhone + " trạng thái: " + isvalid);
        }
    }
}
