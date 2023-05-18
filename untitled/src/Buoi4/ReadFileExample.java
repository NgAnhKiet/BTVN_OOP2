package Buoi4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


//Tính tổng các số file text
public class ReadFileExample {
    public void readFileText(String filePath){
        try {
            //tao file
            File file = new File(filePath);
            //check xem file có ton tai hay khong, neu khong ton tai thi nem ngoai le khong thay file
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            //tao bufferReader bo nho dem de doc file
            BufferedReader br = new BufferedReader(new FileReader(file));
            //tao chuoi line để lưu trữ dữ liệu khi đọc
            String line = "";

            //Tạo biến sum để đếm số ký tự dọc được theo dòng
            int sum = 0;

            //Sử dụng vòng lặp, check điều kiện nếu như dòng trong file có dữ liêu thì in dẽ liệu ra và cộng số đọc dược vào biến tổng


            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            //Đóng bufferread để giải phóng dung lượng
            br.close();
            System.out.println("Tổng là: " + sum);
        } catch (Exception e){
            System.err.println("Ko có file hoặc nội dung lỗi");
        }
    }


    //Mở file => thực hiện việc dọc và ghi dữ liệu => xử lý dữ liệu đọc hoặc ghi được => đóng file

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        //Tạo đối tượng Scanner
        Scanner scanner = new Scanner(System.in);
        //Nhập vào đường dẫn file sử dụng scanner
        String path = scanner.nextLine();
        //Tạo đối tượng mới từ class ReadFileExample có tên là readFileEx
        ReadFileExample readfileEx = new ReadFileExample();

        //Gọi đến hàm ReadFileText và truyền vào tham số là đường dẫn đươợc nhập vao tu ban phim ơ tren bang Scanner
        readfileEx.readFileText(path);
    }

}

