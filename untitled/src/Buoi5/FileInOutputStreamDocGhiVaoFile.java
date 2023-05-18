package Buoi5;

// Thuộc java.io

// Có 3 phương thức khởi tạo và thường dùng phương thức khởi tạo FileInputStream/FileOutputStream với tham số là tên file hoặc đối tượng File để tạo đối tượng.

//4 yếu tố của phương thức read():
//Trả về một giá trị kiểu int đại diện cho byte đã được đọc.
//Đọc byte tiếp theo từ luồng dữ liệu.
//Nếu đã đọc đến cuối file, trả về -1 để chỉ thị kết thúc file.
//Nếu xảy ra lỗi trong quá trình đọc, ngoại lệ IOException sẽ được ném ra.
//4 yếu tố của phương thức write():
//Ghi một byte được cung cấp vào luồng dữ liệu.
//Ghi byte được cung cấp vào vị trí hiện tại trong luồng dữ liệu.
//Nếu ghi thành công, vị trí hiện tại trong luồng dữ liệu được dịch chuyển sang byte tiếp theo.
//Nếu xảy ra lỗi trong quá trình ghi, ngoại lệ IOException sẽ được ném ra.

//4 yếu tố của phương thức close():
//
//Đóng luồng dữ liệu.
//Giải phóng tài nguyên hệ thống liên quan đến luồng dữ liệu.
//Sau khi đóng, không thể đọc hoặc ghi dữ liệu từ luồng nữa.
//Nếu xảy ra lỗi trong quá trình đóng, ngoại lệ IOException sẽ được ném ra.

import java.io.*;
import java.util.Scanner;

//Ném ra ngoại lệ IOException và có thể dùng try/catch để xử lý ngoại lệ
public class FileInOutputStreamDocGhiVaoFile {
    public static void main(String[] args) {
        File file = new File("person.dat");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            System.out.println("Nhập chuỗi: ");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            fileOutputStream.write(line.getBytes());
            fileOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("person.dat");
            System.out.println("Dữ liệu trong file cần in: ");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            byte [] data = new byte[dataInputStream.available()];
            int Read = dataInputStream.read(data);
            String string = new String(data,0,Read);
            System.out.println(string);
            dataInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
