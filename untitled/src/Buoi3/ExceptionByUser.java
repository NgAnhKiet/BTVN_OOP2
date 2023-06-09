package Buoi3;

public class ExceptionByUser {
}
// A Class that represents use-defined exception

class MyException extends Exception {
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}

// A Class that uses above MyException
class Main {
    // Driver Program
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyException("GeeksGeeks");
        }
        catch (MyException ex) {
            System.out.println("Caught");

            // Print the message from MyException object
            System.out.println(ex.getMessage());
        }
    }
}

// B2
// Đoạn mã trên có 2 lớp. Lớp MyException là để kế thừa từ toàn bộ Exception còn lớp main là để chạy thực thi chương trình




