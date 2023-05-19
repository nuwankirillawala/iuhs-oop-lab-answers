import java.util.Scanner;

public class Circle {

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        double area = calculateArea(radius);
        System.out.println("The area of the circle is: " + area);

        scanner.close();
    }
}

// Result:

// Enter the radius of the circle: 5
// The area of the circle is: 78.53982
