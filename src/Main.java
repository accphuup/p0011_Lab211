
public class Main {

    public static void main(String[] args) {
        
        // Init object.
        ChangeBase changeBase = new ChangeBase();
        
        //Step 1: display menu to user choose.
        displayMenu();
        
        //Step 2: display message require user enter inBase and check input.
        int inBase = Unitity.checkInputChoice("The base input your choice: ");

        //Step  3: display message require user enter outBase and check input.
        int outBaseInput = Unitity.checkInputChoice("The base output your choice: ");

        //Step 4: display message require user enter input 
        String inputToConvert = Unitity.checkUserInputValue("Enter input need convert: ", inBase);

        //Step 5: call medthod to change to decimal base.
        changeBase.changeToDecimal(inputToConvert, inBase, outBaseInput);

         //Step 6: call medthod to change from decimal base.
        changeBase.changeFromDecimal();

        //Step 7: call method to display result.
        changeBase.displayResult();
    }

    /**
     * method to display menu for user choose.
     */
    public static void displayMenu() {
        System.out.println("========= Change Base System =========");
        System.out.println("Base 2");
        System.out.println("Base 10");
        System.out.println("Base 16");

    }
}
