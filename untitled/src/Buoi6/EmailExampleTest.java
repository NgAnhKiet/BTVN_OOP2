package Buoi6;

public class EmailExampleTest {
    private  static EmailExample emailExample;
    //Khởi tạo 2 mảng validEmail và inValidEmail vs các phần tử là các email hợp lệ và không hợp lệ
    public static final String [] validEmail = new String[]{"qw12@gmail.com" , "as34@gmail.com"};
    public static final String [] inValidEmail = new String[]{"@gmail.com", "asdu@gmail."};

    public static void main(String[] args) {
        //Khởi tạo 1 đối tượng emailExample
        emailExample = new EmailExample();
        //Sử dụng vòng lặp for để duyệt từng phần tử trong mảng validEmail và sử dụng phương thức
        //validate để kiểm tra hợp lệ hay không và trả về kết quả true false
        for (String email : validEmail){
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email " + email + "hợp lệ " + isvalid);
        }
        for (String email : inValidEmail){
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email " + email + "không hợp lệ " + isvalid);
        }
    }
}

