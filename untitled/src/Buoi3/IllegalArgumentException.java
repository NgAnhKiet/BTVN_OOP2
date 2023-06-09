package Buoi3;

class GFG
{
    public static void main (String[] args)
    {
        // String s set an empty string  and calling getLength()
        String s = "";
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught");
        }

        // String s set to a value and calling getLength()
        s = "GeeksforGeeks";
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught");
        }

        // Setting s as null and calling getLength()
        s = null;
        try
        {
            System.out.println(getLength(s));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("IllegalArgumentException caught");
        }
    }

    // Function to return length of string s. It throws
    // IllegalArgumentException if s is null.
    public static int getLength(String s)
    {
        if (s == null)
            throw new IllegalArgumentException("The argument cannot be null");
        return s.length();
    }
}

// B2
// Hàm getlength là để trả về độ dài của 1 chuỗi đc truyền vào tham số s. Nếu s là null thí nó sẽ ném ra 1 ngoại lệ là IllegalArgumentException

// B3
// IllegalArgumentException caught
//13
//IllegalArgumentException caught

// B4
// Ngoại lệ IllegalArgumentException xảy ra khi tham số được truyền vào hàm là null.


