package abstraction;
/*
- Abstraction - hiding implementation details
- e.g. If you have seen circuit board, you know on-off functionality, and you don't bother about internal
  implementation of circuit board.
- Interface shows you what functionality yu can have in your class.
 */
public interface Shape {

    void draw();//abstract method, these methods are by default public and abstract

    double calculateArea();

}
