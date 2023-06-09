package Buoi1;

public abstract class Shape2 {
    protected String color = "Red";
    protected Boolean filled = true;
    public Shape2 (String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape2{" + "color='" + color + '\'' + ", filled=" + filled + '}';
    }
}

class HinhTron extends Shape2 {
    protected double radius = 1.0;

    public HinhTron(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "HinhTron{Shape2" +
                "radius=" + radius +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}

class Rectangle extends Shape2 {
    protected double width = 1.0;
    protected double lenght = 1.0;
    public Rectangle(String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    @Override
    public double getArea() {
        return width * lenght;
    }

    @Override
    public double getPerimeter() {
        return (width + lenght) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{Shape2" +
                "width=" + width +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", lenght=" + lenght +
                '}';
    }
}

class Square extends Rectangle {
    protected double side;
    public Square(String color, Boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLenght(double lenght) {
        super.setLenght(lenght);
    }

    @Override
    public String toString() {
        return "Square{Rectangle{Shape2" +
                "width=" + width +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", lenght=" + lenght +
                '}';
    }
}

