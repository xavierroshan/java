public class classAbstart {
    public static void main (String[] args){
        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        rectangle.length = 10;
        rectangle.breadth = 20;
        rectangle.calculateArea();
        circle.radius = 3;
        circle.calculateArea();
    }
}

abstract class Shape {
    abstract void calculateArea();
}


class Rectangle extends Shape {
    double length;
    double breadth;
    double area;

    @Override
    void calculateArea() {
        area = length*breadth;
        System.out.printf("the area of the rectangle is: %.2f",area);
        System.out.println();
    }


}

class Circle extends Shape {
    double radius;
    double area;

    void calculateArea() {
        area = 3.14*radius*radius;
        System.out.printf("the area of the circle is: %.2f",area);
        System.out.println();
    }


}