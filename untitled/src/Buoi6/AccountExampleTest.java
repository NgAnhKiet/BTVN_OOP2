package Buoi6;

public class AccountExampleTest {
    private static AccountExample accountExample;
    private static final String[] validAccount = new String[]{"fdt1_23" , "gu12yim" , "amsd065"};
    private static final String[] inValidAccount = new String[]{"dhgF1FDS" ,"1413#45" , "sv12"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account: validAccount){
            boolean isvalid = accountExample.validate(account);
            System.out.println("Tên tài khoản hợp lệ: " + account);
        }
        for (String account : inValidAccount){
            boolean isvalid = accountExample.validate(account);
            System.out.println("Tên tài khoản không hợp lệ: " + account);
        }
    }
}

