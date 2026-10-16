
public class ChangeBase {

    /**
     * Keep the digits 0-9 and A-F to convert between bases.
     */
    private static final String HEX_DIGITS = "0123456789ABCDEF";
    
    /**
     * Keep decimal use in ChangeBase class.
     */
    private int decimal;
    
    /**
     * Keep the base want to convert to.
     */
    private int outBase;
    
    /**
     * Keep the final result after changing base. 
     */
    private String resultChange;
    
    /**
     * Method to change from base 2 and 16 to decimal base.
     * @param input is input from user enter.
     * @param inBase is input from user enter.
     * @param outBaseInput is input from user enter.
     */
    public void changeToDecimal(String input, int inBase, int outBaseInput){
        outBase = outBaseInput;
        
        // Check if base 10 return value decimal.
        if (inBase == 10) {
            decimal = Integer.parseInt(input);
            return;
        }
        
        int exponent = 0;
        
        if (inBase == 2 || inBase == 16) {
            for (int i = input.length() - 1; i >= 0; i--) {
                char character = input.charAt(i);
                
                //Get the number value of the character following index in HEX_DIGITS.
                int digitalValue = HEX_DIGITS.indexOf(Character.toUpperCase(character));
                
                //Use formula decimal + digitalValue * (inBase ^ exponent) to change to decimal.
                decimal += digitalValue * Math.pow(inBase, exponent);
                exponent++;
            }
        }
        
    }
    
    public void changeFromDecimal(){
        
        //check if decimal =0 return 0.
        if (decimal==0) {
            resultChange = "0";
            return;
        }
        
        if (outBase == 10) {
            resultChange = String.valueOf(decimal);
            return;
        }
        
        String  result ="";
        while (decimal >0) {            
            int remainder = decimal % outBase;
            
            result = HEX_DIGITS.charAt(remainder) + result;
            
            decimal /= outBase;
        }
        resultChange = result;
    }
    
    public void displayResult(){
        System.out.println("The value of change: " + resultChange);
    }
    
}
