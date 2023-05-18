package Buoi4;

import java.io.IOException;

public class FileReader {
    public static void main(String[] args) throws IOException {
        //Gọi đến 1 file có sẵn
        java.io.FileReader fileReader = new java.io.FileReader("D:\\BTVN_OOP2\\untitled\\src\\Buoi4\\text.txt");
        int i = 0;
        //Dùng vòng lặp while uyệt từng phần tử để lấy các kí tự trong file
        while ((i = fileReader.read()) != -1){
            //Ép kiểu sang char để in ra
            System.out.print((char) i);
        }
    }
}
