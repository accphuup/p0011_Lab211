
import java.util.Scanner;

public class Unitity {

    /**
     * Create scanner with field private.
     */
    private final static Scanner scanner = new Scanner(System.in);

    /**
     * Method to check valid input user.
     * @param message is message require user enter input.
     * @param base is base to convert.
     * @return input.
     */
    public static String checkUserInputValue(String message, int base) {
        String checkFormat;
        
        //Check valid format of bases.
        if (base == 2) {
            checkFormat = "[01]+";
        } else if (base == 10) {
            checkFormat = "[0-9]+";
        } else {
            checkFormat = "[0-9A-F]+";
        }
        
        //Check valid format of bases.
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.isEmpty()) {
                System.err.println("Input not be empty! Enter again. ");
            }
            if (input.matches(checkFormat)) {
                return input;
            }
            System.err.println("Input Invalid for base" + base + "! Enter again.");
        }
    }

    /**
     * Method to check input user choice base.
     * @param message is message require user enter input. 
     * @return  number.
     */
    public static int checkInputChoice(String message) {
        while (true) {
            try {
                System.out.print(message);
                String input = scanner.nextLine().trim();
                int number = Integer.parseInt(input);

                if (number == 2 || number == 10 || number == 16) {
                    return number;
                } else {
                    System.err.println("Input must be number 2, 10 , 16. Enter again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid format! Please enter again.");
            }
        }
    }

}
