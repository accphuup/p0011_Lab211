/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
         //loop until user want to exit
        while (true) {
            int choice = ChangeBase.menu();
            switch (choice) {
                case 1:
                    String binary = Unitity.checkInputBinary();
                    ChangeBase.convertFromBinary(binary);
                    break;
                case 2:
                    String decimal = Unitity.checkInputDecimal();
                    ChangeBase.convertFromDecimal(decimal);
                    break;
                case 3:
                    String hexa = Unitity.checkInputHexaDecimal();
                    ChangeBase.convertFromHexa(hexa);
                    break;
                case 4:
                    return;
            }
        }
    }
}
