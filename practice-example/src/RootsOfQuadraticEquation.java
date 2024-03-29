import java.util.Scanner;

public class RootsOfQuadraticEquation {

    public static void main(String[] args) {

        System.out.println("Fnd the Roots of Quadratic Equation.");
        System.out.println("Enter the value of a, b, c.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();
        System.out.print("c = ");
        double c = scanner.nextDouble();
        double root1, root2;

        //calculate the determinant (b^2 - 4ac)
        double determinant = b*b - 4*a*c;

        //check if determinant is greater than 0
        if (determinant > 0){
            root1 = (-b + Math.sqrt(determinant)) / (2*a);
            root2 = (-b - Math.sqrt(determinant)) / (2*a);

            System.out.format("root1 = %.2f and root2 = %.2f" , root1, root2);
        }

        //if determinant is less than 0
        else {

            //rots are complex number and distinct
            double real = -b / (2*a);
            double imaginary = Math.sqrt(-determinant) / (2*a);
            System.out.format("root1 = %.2f + %.2fi" , real, imaginary);
            System.out.format("\nroot2 = %.2f - %.2fi", real, imaginary);
        }
    }
}
