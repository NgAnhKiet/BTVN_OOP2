package Buoi4;

import java.io.File;
import java.io.IOException;

public class FileWriter {
    //Viết lớp main và ném ra ngoại lệ IOException
    public static void main(String[] args) throws IOException {
        //Tạo 1 file trong đường dẫn
        File file = new File("D:\\BTVN_OOP2\\untitled\\src\\Buoi4\\text.txt");
        file.createNewFile();
        //Ghi vào file trong đường dẫn
        java.io.FileWriter fileWriter = new java.io.FileWriter("D:\\BTVN_OOP2\\untitled\\src\\Buoi4\\text.txt");
        //Ghi chuỗi vào file
        fileWriter.write("cccccadfcàdciaycga");
        //Đóng file
        fileWriter.close();
    }
    }

