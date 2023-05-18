package Buoi4;

//Bước 5: Lớp FileReader đc kế thừa từ lớp Object và đc thực thi từ interface Serializable và Comparable

//Bước 6: Lớp File đc sử dụng để thao tác với các tập tin trên hệ thống tệp của máy tính.

//Bước 7: Có 4 phương thức khởi tạo
// 1. Dùng để tạo ra 1 file mới
// 2. Tham số đầu vào:
// - String pathname
// - String parent, String child
// - File parent, String child
// - URI uri

import java.io.File;

//Bước 8:
// Mục đích
// getName: Lấy tên của file         - getPath: Lấy đường dẫn tuyệt đối của file
// Tên phương thức:
// getName                           - getPath
// Tham số đầu vào
// Cả 2 đều ko có
// Kiểu giá trị trả về
// Cả 2 đều là String
public class docLopFileReader {
    public static void main(String[] args) {
        //Tạo đối tượng file
        String filename = "text.txt";
        //Phương thức getName() và in ra
        File file = new File(filename);
        String fileName = file.getName();
        System.out.println(fileName);
        //phương thức getPath() và in ra
        String filePath = file.getPath();
        System.out.println(filePath);
    }
}
