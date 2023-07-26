/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validateemail;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ntpsm
 */
public class ValidateEmail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email address ");
        String e = sc.next();  
        
          if (isValidEmail(e)) {
            System.out.println(e + " is a valid email");
        } else {
            System.out.println(e + " is not a valid email");
        }
    }
     public static boolean isValidEmail(String input) {
        String decimalPattern = "^(?!\\\\.|@|www)[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";

        Pattern pattern = Pattern.compile(decimalPattern);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
    
}
