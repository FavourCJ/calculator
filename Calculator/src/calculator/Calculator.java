//Code By Dev_FavourCJ
package calculator;
import java.util.*;


/**
 *
 * @author user
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       //variable delclaration
        int result;
        
        // Asking for user inputs
        Scanner userInput = new Scanner (System.in);
        System.out.println("Enter first number you will like to calculate");
        String num1 = userInput.nextLine();
       
        
        Scanner userInput2 = new Scanner (System.in);
        System.out.println("Enter next number you will like to calculate");
        String num2 = userInput2.nextLine();
        
        Scanner UserOperator = new Scanner (System.in);
        System.out.println("Enter perator you will like to calculate(+ or - or * or/)");
        String operator = UserOperator.nextLine();
               
       
      switch(operator)
      {
          //if user input operator is equal to +
          case "+" :
              result =Integer.parseInt(num2) + Integer.parseInt(num1);
              System.out.println(result);
              break;
              
               //if user input operator is equal to -
              case "-" :
              result =Integer.parseInt(num2) - Integer.parseInt(num1);
              System.out.println(result);
              break;
              
               //if user input operator is equal to *
              case "*" :
              result =Integer.parseInt(num2) * Integer.parseInt(num1);
              System.out.println(result);
              break;
              
               //if user input operator is equal to /
              case "/" :
              result =Integer.parseInt(num2) / Integer.parseInt(num1);
              System.out.println(result);
              break;
      }
    }
    
}
