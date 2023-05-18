package Buoi4;

//Bước 1: https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/io/FileReader.html

//Bước 2: Đc kế thừa từ lớp InputStreamReader

//Bước 3: Lớp FileReader ko thực thi từ interface nào

//Bước 4: Dùng để đọc các đoạn văn bản từ trong file

//Bước 5: Lớp FileReader có 2 phương thức khởi tạo
//FileReader(String fileName)
//Mục đích: Tạo một đối tượng FileReader để đọc dữ liệu từ tệp có tên được chỉ định bởi tham số fileName
//Tham số đầu vào: fileName: Đường dẫn hoặc tên tệp cần đọc dữ liệu từ đó. Nó có thể là đường dẫn tuyệt đối hoặc tương đối đến tệp

//FileReader(File file)
//Mục đích: Tạo một đối tượng FileReader để đọc dữ liệu từ tệp được đại diện bởi đối tượng File được chỉ định.
//Tham số đầu vào: file: Đối tượng File đại diện cho tệp cần đọc dữ liệu từ đó.

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Bước 6:
//Lớp FileReader trong Java cung cấp một số phương thức thường được sử dụng để đọc dữ liệu từ tệp
//int read()
//Tên phương thức: read()
//Mục đích: Đọc một ký tự từ tệp.
//Tham số đầu vào: Không có.
//Kết quả trả về: Trả về giá trị ký tự đọc được từ tệp. Nếu đã đọc đến cuối tệp, trả về -1.
public class xayDungHuongDanDocLopFileReader {
    public static void FileReader()throws IOException{
        //Truy cập vào 1 file có sẵn
            java.io.FileReader fileReader = new FileReader("D:\\BTVN_OOP2\\untitled\\src\\Buoi4\\test.txt");
            //Khai báo biến sum = 0
            int sum = 0;
            //Dùng vòng lặp while uyệt từng phần tử để lấy kí tự trong file
            while ((sum = fileReader.read()) != -1){
                //Ép kiểu sang char để in ra
                System.out.print((char) sum);
            }
    }
    //Tạo phương thức main để chạy chương trình
    public static void main(String[] args) throws IOException {
        //Gọi đến phương thức FileReader
        FileReader();
    }
}
