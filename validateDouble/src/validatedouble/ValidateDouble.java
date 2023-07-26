/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validatedouble;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ntpsm
 */
public class ValidateDouble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         //String input = "123.45"; 
         Scanner sc = new Scanner(System.in);
        System.out.print("Plesae enterdegree in fahrenheit ");
        String f = sc.next();  

        if (isDecimalNumber(f)) {
            Double f2 = Double.valueOf(f);
            double c = (f2 - 32) * 5 / 9;
            System.out.println(f + " fahrenheit is " + c);
            System.out.println("Goodbye");
        } else {
            System.out.println("Your input is not valid");
            System.out.println("Goodbye");
        }
    }
  public static boolean isDecimalNumber(String input) {
        String decimalPattern = "\\d+(\\.\\d*)?$";

        Pattern pattern = Pattern.compile(decimalPattern);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
   
}
