import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Enter the first number: ");
        double n1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double n2 = scanner.nextDouble();

        System.out.print("Enter an operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = calc.calculate(n1, n2, operation);
        System.out.println("Result: " + result);

        scanner.close();
    }
}