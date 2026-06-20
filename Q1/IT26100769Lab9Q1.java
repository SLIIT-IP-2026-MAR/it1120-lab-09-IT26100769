import java.util.Scanner;

public class IT26100769Lab9Q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
        System.out.print("Enter value a: ");
        double a = input.nextDouble();

        System.out.print("Enter value b: ");
        double b = input.nextDouble();

        System.out.print("Enter value c: ");
        double c = input.nextDouble();

        // Calculate  (b^2 - 4ac)
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        // Check if roots are real
        if (discriminant >= 0) {
            System.out.println("\nRoots are real and different :");

            // Calculate both roots using Math.sqrt()
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            // Print formatted outputs to 2 decimal places matching the sample
            System.out.format("Root 1: %.2f\n", root1);
            System.out.format("Root 2: %.2f\n", root2);
        } else {
            System.out.println("\nRoots are complex/imaginary.");
        }

      
    }
}