package abstraction;

public class Square implements Shape{

  float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("I'm drawing a square..");
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
}
