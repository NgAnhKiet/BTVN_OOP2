package Buoi6;

public class ValidateClassNameTest {
    private static ValidateClassName validateClassName;
    private static final String [] validClassName = new String[]{"C0223G" , "A0323K"};
    private static final String [] inValidClassName = new String[]{"M0318G" , "P0323A"};

    public static void main(String[] args) {
        validateClassName = new ValidateClassName();
        for (String className : validClassName){
            boolean isvalid = validateClassName.validate(className);
            System.out.println("Tên lớp học hợp lệ: " + className + " trạng thái: "+ isvalid);
        }
        for (String className : inValidClassName){
            boolean isvalid = validateClassName.validate(className);
            System.out.println("Tên lớp học không hợp lệ: " + className + " trạng thái: " + isvalid);
        }
    }
}
