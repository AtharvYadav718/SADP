import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Variables to store the first two Fibonacci numbers
        int first = 0, second = 1;

        // Print the Fibonacci series
        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Calculate the next number in the series
            int next = first + second;

            // Update the variables for the next iteration
            first = second;
            second = next;
        }
    }
}
