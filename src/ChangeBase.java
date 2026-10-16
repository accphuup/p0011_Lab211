/**
 * ChangeBase to change base of 2, 10, 16.
 *
 * @version 16/10/2026
 * @author VinhHQHE194318
 */
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
     *
     * @param inputToConvert is input from user enter.
     * @param inBaseInput is input from user enter.
     * @param outBaseInput is input from user enter.
     */
    public void changeToDecimal(String inputToConvert, int inBaseInput, int outBaseInput) {
        outBase = outBaseInput;

        // Check if base 10 return value decimal.
        if (inBaseInput == 10) {
            decimal = Integer.parseInt(inputToConvert);
            return;
        }

        int exponent = 0;

        //Check if base 2 or 16 then change to decimal base. 
        if (inBaseInput == 2 || inBaseInput == 16) {
            for (int i = inputToConvert.length() - 1; i >= 0; i--) {
                char character = inputToConvert.charAt(i);

                //Get the number value of the character following index in HEX_DIGITS.
                int digitalValue = HEX_DIGITS.indexOf(Character.toUpperCase(character));

                //Use formula decimal + digitalValue * (inBase ^ exponent) to change to decimal.
                decimal += digitalValue * Math.pow(inBaseInput, exponent);
                exponent++;
            }
        }

    }

    /**
     * Method to change base from decimal base.
     */
    public void changeFromDecimal() {

        //check if decimal =0 return 0.
        if (decimal == 0) {
            resultChange = "0";
            return;
        }
        //Check if outBase =  10 return value of decimal.
        if (outBase == 10) {
            resultChange = String.valueOf(decimal);
            return;
        }

        String result = "";
        
        //Loop to convert from decimal base to else base.
        while (decimal > 0) {
            
            //Take remainder.
            int remainder = decimal % outBase;

            // Add the remainder to the beginning of result string.
            result = HEX_DIGITS.charAt(remainder) + result;

             //Take the integer part.
            decimal /= outBase;
        }
        resultChange = result;
    }

    public void displayResult() {
        System.out.println("The value of change: " + resultChange);
    }

}
