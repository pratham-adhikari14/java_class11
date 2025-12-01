package day_10;

public class Rectangle {
    private double length;
    private double breadth;
    private double area;
    private double perimeter;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void areaOfRectangle() {
        area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
}
