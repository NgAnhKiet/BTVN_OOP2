package Buoi3;

import java.util.Scanner;

public class tryCatch {
}
class Test
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        try
        {
            int n = Integer.parseInt(scn.nextLine());

            if (99%n == 0)
                System.out.println(n + " is a factor of 99");
        }
        catch (ArithmeticException ex)
        {
            System.out.println("Arithmetic " + ex);
        }
        catch (NumberFormatException ex)
        {
            System.out.println("Number Format Exception " + ex);
        }
    }
}

// Bước 2
// Đoạn mã trên có 2 catch, catch 1 được sử dụng để bắt lỗi khi có phép toán số học không hợp lệ,
// catch 2 được sử dụng để bắt lỗi khi xảy ra sai sót trong quá trình chuyển đổi chuỗi thành số,

// Bước 3
// GeeksforGeeks nhập vào ko thể ép kiểu trở thành kiểu số nguyên nên nó sẽ nhảy vào NumberFormatException và thực thi đoạn mã bên dưới catch NumberFormatException

// Bước 4
// Trong toán học thì 1 phép chia cho 0 là ko hợp lệ nên nó sẽ nhảy vào ArithmeticException và thực thi đoạn mã bên dưới catch ArithmeticException

// Bước 6
// Đoạn mã đã chèn thêm toán tử | vào khối catch để có thể bắt nhiều ngoại lệ 1 lúc nên khi nhập giá trị như bước 3, 4
// cả 2 khối catch sẽ đc thực thi và in ra thông báo tương ứng

class Test2
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        try
        {
            int n = Integer.parseInt(scn.nextLine());
            if (99%n == 0)
                System.out.println(n + " is a factor of 99");
        }
        catch (NumberFormatException | ArithmeticException ex)
        {
            System.out.println("Exception encountered " + ex);
        }
    }
}



