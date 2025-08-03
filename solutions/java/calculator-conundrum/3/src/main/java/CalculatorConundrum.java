import java.util.Arrays;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null) {
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation == "") {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
        
        if (!Arrays.asList("+","-","*","/").contains(operation)) {
            throw new IllegalOperationException("Operation '" + operation + "' does not exist");
        }
        
        int result = 0;
        if (operation == "+") {
            result = operand1 + operand2;
        }
        if (operation == "-") {
            result = operand1 - operand2;
        }
        if (operation == "*") {
            result = operand1 * operand2;
        }
        if (operation == "/") {
            try {
                result = operand1 / operand2;
            } catch (ArithmeticException e) {
                throw new IllegalOperationException("Division by zero is not allowed", e);
            }
        }
        
        String calculation = String.format("%d %s %d = %d", operand1, operation, operand2, result);
        
        return calculation;
    }
}
