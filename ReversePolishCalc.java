
public class ReversePolishCalc {

    int topStackIdx = -1;

    private String[] tokens;

    private String[] stack;

    public double calculate(String input) {

        tokens = input.split(",");

        stack = new String[tokens.length];

        double operand1;
        double operand2;
        double results;
        // 3. write the algorithm
        for (int i = 0; i < tokens.length; ++i) {
            // calls to push() and pop() and do the math here;
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                push(tokens[i]);
            } else if (tokens[i].equals("+")) {
                operand1 = pop();
                operand2 = pop();
                results = operand1 + operand2;
                push(results);
            } else if (tokens[i].equals("-")) {
                operand1 = pop();
                operand2 = pop();
                results = operand2 - operand1;
                push(results);
            } else if (tokens[i].equals("*")) {
                operand1 = pop();
                operand2 = pop();
                results = operand1 * operand2;
                push(results);
            } else if (tokens[i].equals("/")) {
                operand1 = pop();
                operand2 = pop();
                results = operand2 / operand1;
                push(results);
            }
        }

        return pop();
    }

    private void push(String number) {
        stack[++topStackIdx] = number;
    }

    private void push(double d) {
        stack[++topStackIdx] = String.valueOf(d);
    }

    private double pop() {
        return Double.valueOf(stack[topStackIdx--]);
    }
}
