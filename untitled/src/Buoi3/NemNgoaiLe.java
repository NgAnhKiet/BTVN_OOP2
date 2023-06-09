package Buoi3;

public class NemNgoaiLe {
}
class ThrowExcep
{
    static void fun()
    {
        try
        {
            throw new NullPointerException("demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }
    public static void main(String args[])
    {
        try
        {
            fun();
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught in main.");
        }
    }
}

// Bước 2
// Throw dùng để ném 1 đối tượng ngoại lệ

// Bước 3
// Để tạo ra 1 đối tượng ngoại lệ NullPointerException với thông điệp là "demo" và ném vào khối catch tiếp theo của phương thức fun

// Bước 4
// Lệnh throw e dùng để ném lại đối tượng ngoại lệ e vào 1 ngoại lệ cao hơn hoặc bằng (trong trường hợp này là bằng)

// Bước 5
// Nó sẽ in ra Caught inside fun(). và Caught in main.
// Vì phương thức fun() ném một ngoại lệ NullPointerException và xử lý nó trong khối catch trong cùng phương thức
// và lại đc ném lại vào phương thức main và in ra Caught in main.
