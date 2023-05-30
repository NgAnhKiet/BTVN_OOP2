package Buoi5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInOuputStreamDungPhuongThuc {
    public boolean writeData(String data, String fileName){
        try {
            //Khởi tạo fileOutputStream và sử dụng phương thức write để nhập vào và close để đóng file
            FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
            fileOutputStream.write(data.getBytes());
            fileOutputStream.close();
            //Trả về giá trị true nếu thành công, false nếu dính ngoại lệ IOException
            return true;
        }catch (IOException e){
            return false;
        }
    }

    public void readData(){
        try {
            //Tạo 1 fileInputStream để đọc dữ liệu từ file data.dat
            FileInputStream fileInputStream = new FileInputStream("data.dat");
            //Tạo một mảng byte data với kích thước là fileInputStream.available
            byte [] data = new byte[fileInputStream.available()];
            //Dùng phương thức read để đọc dữ liệu từ mảng data và gán vào biến read
            int read = fileInputStream.read(data);
            //Chuyển đổi mảng data từ dạng byte thành chuỗi chỉ định vị trí bắt đầu là 0
            String string = new String(data, 0, read);
            //In ra string
            System.out.println(string);
            //Đóng file
            fileInputStream.close();
        }catch (IOException e){
            e.getMessage();
        }
    }

    public static void main(String[] args) {
        FileInOuputStreamDungPhuongThuc a1= new FileInOuputStreamDungPhuongThuc();
        System.out.println("Nhập chuỗi: ");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        System.out.println(a1.writeData(data,"data.dat"));
        a1.readData();
    }
}
