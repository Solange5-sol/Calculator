
    import java.util.Scanner;

    public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public double getNumber(String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    public char getOperation() {
        System.out.print("Enter an operation (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public void close() {
        scanner.close();
    }
}

