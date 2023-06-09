package Buoi3;

public class NullPoiterException {
}
class GFG2
{
    public static void main (String[] args)
    {
        // Initializing String variable with null value
        String ptr = null;

        // Checking if ptr is null using try catch.
        try
        {
            if ("gfg".equals(ptr))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("Caught NullPointerException");
        }
    }


}

// B1
// Sẽ xảy ra lỗi vì ptr có giá trị là null

// B2
// Nó sẽ nhảy vào khối catch NullPointerException và in ra NullPointerException Caught vì ptr có giá trị là null

// B3
// NullPointerException xảy ra khi phần tử có giá trị bằng null

// B4
// Nó sẽ in ra Not Same vì gfg khác vs ptr vs không có bất kỳ thao tác nào được thực hiện trên biến "ptr"

