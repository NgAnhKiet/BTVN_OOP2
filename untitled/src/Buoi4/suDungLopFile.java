package Buoi4;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class suDungLopFile {
    //Viết lớp main vs ném 1 ngoại lệ IOException
    public static void main(String[] args) throws IOException {
        //Tạo 1 file mới
        File file = new File("D:\\BTVN_OOP2\\untitled\\src\\Buoi4\\newfile.txt");
        file.createNewFile();
        //Kiểm tra xem file có tồn tại hay ko
        if (file.exists()) {
            System.out.println("File đã tồn tại");
        } else {
            System.out.println("File không tồn tại");
            //Kiểm tra xem file có phải là thư mục hay không
            boolean Directory = file.isDirectory();
            System.out.println(Directory);
            //Lấy đường dẫn của file
            String Path = file.getPath();
            System.out.println(Path);
        }
    }
}
