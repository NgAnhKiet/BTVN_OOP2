package Buoi4;

import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;

//Class sinh viên
public class SinhVien {
    //Khai biến
    private String MaSinhVien;
    private String TenSinhVien;
    private double DiemToan;
    private double DiemLy;
    private double DiemHoa;

    //Phương thức khởi tạo
    public SinhVien(String MaSinhVien,String TenSinhVien, double DiemToan, double DiemLy, double DiemHoa){
        this.MaSinhVien = MaSinhVien;
        this.TenSinhVien = TenSinhVien;
        this.DiemToan = DiemToan;
        this.DiemLy = DiemLy;
        this.DiemHoa = DiemHoa;
    }

    //Getter/Setter
    public void setMaSinhVien(String maSinhVien) {
        MaSinhVien = maSinhVien;
    }

    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public String getTenSinhVien() {
        return TenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        TenSinhVien = tenSinhVien;
    }

    public double getDiemToan() {
        return DiemToan;
    }

    public void setDiemToan(double diemToan) {
        DiemToan = diemToan;
    }

    public double getDiemLy() {
        return DiemLy;
    }

    public void setDiemHoa(double diemHoa) {
        DiemHoa = diemHoa;
    }

    public double getDiemHoa() {
        return DiemHoa;
    }

    public void setDiemLy(double diemLy) {
        DiemLy = diemLy;
    }

    //ToString

    @Override
    public String toString() {
        return "SinhVien{" +
                "MaSinhVien='" + MaSinhVien + '\'' +
                ", TenSinhVien='" + TenSinhVien + '\'' +
                ", DiemToan=" + DiemToan +
                ", DiemLy=" + DiemLy +
                ", DiemHoa=" + DiemHoa +
                '}';
    }

    //Phương thức sinh viên
    public boolean luuSV(SinhVien SV){
        try {
            //BufferWritter để cung cấp bộ nhớ đệm ghi 1 chuỗi dài và ghi file
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\BTVN_OOP2\\untitled\\src\\Buoi4\\SinhVien.txt", true));
            bufferedWriter.write(SV.getTenSinhVien() +" , " + SV.getMaSinhVien() +" , " + SV.getDiemToan() + " , " + SV.getDiemLy() + " , " + SV.getDiemHoa());
            bufferedWriter.close();
            return true;
        } catch (IOException e){
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        //Khởi tạo các đối tượng sinh viên
        SinhVien sinhVien0 = new SinhVien("0001", "Nguyễn A", 10, 9, 9);
        SinhVien sinhVien1 = new SinhVien("0002", "Nguyễn B", 9, 10, 9);
        SinhVien sinhVien2 = new SinhVien("0003", "Nguyễn B", 9, 9, 10);
        //In ra các đối tượng
        System.out.println(sinhVien0.luuSV(sinhVien0));
        System.out.println(sinhVien1.luuSV(sinhVien1));
        System.out.println(sinhVien2.luuSV(sinhVien2));
        try {
            //FileReader để đọc 1 file có sẵn và BufferedReader để cấp bộ nhớ đệm đọc nhanh hơn...
            FileReader fileReader = new FileReader("D:\\BTVN_OOP2\\untitled\\src\\Buoi4\\SinhVien.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //Khai báo 1 line để lưu trữ
            String line;
            //Dùng while để duyệt các phần tử trong file và đẩy vào line xong in ra
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            //Đóng BufferedReader
            bufferedReader.close();
        }catch (IOException e){
            e.getMessage();
        }
    }
}
