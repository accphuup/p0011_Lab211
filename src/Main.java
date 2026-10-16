
public class Main {
    public static void main(String[] args) {
   
        ChangeBase changeBase = new ChangeBase();
        
        displayMenu();
        
        int inBase = Unitity.checkInputChoice("The base input your choice: ");
     
         int outBase = Unitity.checkInputChoice("The base output your choice: ");
       
String input = Unitity.checkUserInputValue("Enter input value: ", inBase);

changeBase.changeToDecimal(input, inBase, outBase);

changeBase.changeFromDecimal();



changeBase.displayResult();
    }
     public static void displayMenu(){
        System.out.println("========= Change Base System =========");
        System.out.println("Base 2");
        System.out.println("Base 10");
        System.out.println("Base 16");
    
        }
}
