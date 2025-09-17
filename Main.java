public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Input input = new Input();

        char choice;
        do {
            double n1 = input.getNumber("Enter the first number: ");
            double n2 = input.getNumber("Enter the second number: ");
            char operation = input.getOperation();

            double result = calc.calculate(n1, n2, operation);
            System.out.println("Result: " + result);

            System.out.print("Do you want to calculate again? (y/n): ");
            choice = input.getOperation();  
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Goodbye!");
        input.close();
    }
}