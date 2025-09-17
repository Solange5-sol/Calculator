public class Calculator {
    public double calculate(double n1, double n2, char operation) {
        double result = 0; 

        switch (operation) {
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                    return 0;
                }
                result = n1 / n2;
                break;
            default:
                System.out.println("Error: Invalid operation '" + operation + "'");
                return 0;
        }

        return result;
    }
}