package Buoi5;

import java.io.*;


public class Product implements Serializable{
    //Khai báo 3 biến
    private String ProID;
    private String ProName;
    private int Prize ;

    //Phương thức khởi tạo 3 tham số
    public Product(String ID , String name , int prize){
        this.ProName = name;
        this.ProID = ID;
        this.Prize = prize;
    }
    public Product(){

    }
    //Getter và Setter

    public String getProID() {
        return ProID;
    }

    public void setProID(String proID) {
        ProID = proID;
    }

    public String getProName() {
        return ProName;
    }

    public void setProName(String proName) {
        ProName = proName;
    }

    public int getPrize() {
        return Prize;
    }

    public void setPrize(int prize) {
        Prize = prize;
    }

    //ToString
    public String toString(){
        return "product id : " + getProID() + " product name : " + getProName() + " prize : " + getPrize();
    }
}
class ProductProcess{
    public static boolean WriteProduct(Product[] obj , String filename ){
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filename));
            objectOutputStream.writeObject(obj);
            objectOutputStream.close();
            return true;
        }catch (IOException e){
            System.out.println( e.getMessage());
            return false;
        }
    }
    public static Product[] readProduct(String file){
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
            Product [] products = (Product[]) objectInputStream.readObject();
            for (Product productList: products) {
                System.out.println(productList.toString());
            }
            objectInputStream.close();
            return new Product[]{};
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
class ProductApp{
    public static void main(String[] args) {
        Product [] product = new Product[2];
        product[0] = new Product();
        product[0].setProID("A1");
        product[0].setProName("Iphone");
        product[0].setPrize(12122);
        product[1] = new Product("A2","SamSung",12);
        boolean isSuc = ProductProcess.WriteProduct(product,"project.dat");
        System.out.println(isSuc);
        ProductProcess.readProduct("project.dat");
    }
}