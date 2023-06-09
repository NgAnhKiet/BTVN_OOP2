package Buoi3;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập độ dài cạnh 1 tam giác: ");
            int x = scanner.nextInt();
            System.out.println("Nhập độ dài cạnh 2 tam giác: ");
            int y = scanner.nextInt();
            System.out.println("Nhập độ dài cạnh 3 tam giác: ");
            int z = scanner.nextInt();
        } catch (Exception e){
            System.out.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}