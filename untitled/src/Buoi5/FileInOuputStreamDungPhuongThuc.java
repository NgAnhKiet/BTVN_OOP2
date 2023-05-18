package Buoi5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileInOuputStreamDungPhuongThuc {
    public boolean writeData(String data, String fileName){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);
            fileOutputStream.write(data.getBytes());
            fileOutputStream.close();
            return true;
        }catch (IOException e){
            return false;
        }
    }

    public void readData(){
        try {
            FileInputStream fileInputStream = new FileInputStream("data.dat");
            byte [] data = new byte[fileInputStream.available()];
            int read = fileInputStream.read(data);
            String string = new String(data, 0, read);
            System.out.println(string);
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
