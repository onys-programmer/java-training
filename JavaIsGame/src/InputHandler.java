import java.util.Scanner;

public class InputHandler {
    private String inputValue;

    public String recieveInput(String inputValue) {
        Scanner scanner1 = new Scanner(System.in);

        inputValue = scanner1.nextLine();
        return inputValue;
    }
}
