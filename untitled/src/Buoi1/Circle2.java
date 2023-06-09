package Buoi1;

public class Circle2 {
    private double raidus;
    private String color;
    public Circle2(String color, double raidus){
        this.color = color;
        this.raidus = raidus;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getRaidus() {
        return raidus;
    }

    public void setRaidus(double raidus) {
        this.raidus = raidus;
    }


    @Override
    public String toString() {
        return "Circle{color='" + color + "', radius=" + raidus + "}";
    }
}
class Cylinder extends Circle2 {
    private double theTich;
    public Cylinder(String color, double raidus) {
        super(color, raidus);
    }

    public double getTheTich() {
        return theTich;
    }

    public void setTheTich(double theTich) {
        this.theTich = theTich;
    }

    @Override
    public String toString() {
        return "Cylinder: Thể tích= " + theTich + "radius" + getRaidus() + "color: " + getColor();
    }
}