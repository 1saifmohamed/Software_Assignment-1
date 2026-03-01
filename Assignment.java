package assignment;


import java.util.Scanner;

public class Assignment {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome To simple Calculator");
        System.out.println("Enter the first Integer");
        float number1 = input.nextInt();
        
        
        System.out.println("Enter the second Integer");
        float number2 = input.nextInt();
        
        float sum = number1 + number2 ;
        float minus = number1 - number2 ;
        float multiply = number1 * number2 ;
        float divide = (number1 / number2) ;
       
        String choice = " ";
        System.out.println("Choose on operation ( + , - , * ,/ )");
            choice = input.next();
            
        switch (choice){
            case "+":
            System.out.printf("The sum is : %f" , sum);   
            break;
            
            case "-":
            System.out.printf("The minus is : %f" , minus);
            break;
            case "*":
            System.out.printf("The multiply is : %f" , multiply);
            break;
            case "/":
            System.out.printf("The divide is : %f" , divide);
            break;
        
        
        }
       
       
       
      
        

    }
    
}
