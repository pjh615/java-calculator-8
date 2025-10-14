package calculator;

public class Application {
    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        OutputHandler outputHandler = new OutputHandler();
        Calculator calculator = new Calculator();

        String input = inputHandler.input();
        Integer result = calculator.calculate(input);
        outputHandler.output(result);

    }
}
