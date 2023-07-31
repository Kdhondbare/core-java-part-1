package abstraction;

public class Driver {

    public static void main(String[] args) {
        Shape circle = new Circle(25);
        Shape square = new Square(15);
        Shape rectangle = new Rectangle(30.5f , 12);


        circle.draw();
        System.out.println("The area of circle is : " + circle.calculateArea());
        square.draw();
        System.out.println("The area of square is : " + square.calculateArea());
        rectangle.draw();
        System.out.println("The area of rectangle is : " + rectangle.calculateArea());

        Shape2 triangle = new Triangle(20 , 35);
        triangle.draw();
        triangle.colour();
        System.out.println("The area of triangle is : " + triangle.calculateArea());
    }
}
