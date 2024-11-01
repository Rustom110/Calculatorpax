
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    
    //put do-while loop then inside the do loop is the try and 
    //catch..ok!
    
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("          Simple Calculator");
        System.out.println(" ----------------------------------------- ");
        System.out.println("");
        System.out.println("Operation to be used:");
        Thread.sleep(100);
        System.out.println("");
        String names[] = {"1. Addition(+)", "2. Subtraction(-)", "3. Multiplication(*)",
"4. Division(/)", "5. Modulo(%)", "6. Exit(0)"}; 
        for (int a = 0; a < names.length; a++){
            Thread.sleep(100);
            System.out.println(names[a]);
        }
        System.out.println();
        Scanner in = new Scanner (System.in);
        float num1, num2;
        
        try{
            
              char operator;
                do{
                System.out.println("============================================");
                System.out.print("Select Choice : ");
                operator = in.next().charAt(0);
                System.out.println("============================================");
                    
                // This code break the loop preventing the"Enter number" in printing.    
                if (operator == '6') {
                    System.out.println();
                    System.out.println("============================================");
                    System.out.println("Thank you for using this!");
                    System.out.println("============================================");
                    System.exit(0);
                    break;
                }  
                    
                System.out.println("============================================");
                System.out.print("Enter first number: ");
                num1 = in.nextFloat();
                System.out.println("============================================");
                
                System.out.println("============================================");
                System.out.print("Enter Second Number: ");
                num2 = in.nextFloat();
                System.out.println("============================================");
                
        
             switch(operator) {
            case '1':
                 System.out.println();
                 float ans = num1 + num2;
                 System.out.println("============================================");
                 System.out.println("Answer : "+ans);
                 System.out.println("============================================");
                 System.out.println();
            break;
            case '2':
                 System.out.println();
                 float an= num1 - num2;
                 System.out.println("============================================");
                 System.out.println("Answer : "+an);
                 System.out.println("============================================");
                 System.out.println();
            break;
            case '3':
                 System.out.println();
                 float answer = num1 * num2;
                 System.out.println("============================================");
                 System.out.println("Answer : "+answer);
                 System.out.println("============================================");
                 System.out.println();
            break;
            case '4':
                 System.out.println();
                 float answe = num1 / num2;
                 System.out.println("============================================");
                 System.out.println("Answer : "+answe);
                 System.out.println("============================================");
                 System.out.println();
            if (num2 == 0) {
                 System.out.println("============================================");
                 System.out.println("Error!");
                 System.out.println("============================================");
            }
                else if (num1 == 0){
                  System.out.println("============================================");   
                  System.out.println("Error!");  
                  System.out.println("============================================");
        }
                else {
                    System.out.println("============================================");
                    System.out.println("Answer : "+answe);
                    System.out.println("============================================");
            }
                 System.out.println();
            break;
            case '5':
                 System.out.println();
                 float a = num1 % num2;
                 int answ = (int)a;
                 if(num1 < num2){
                     System.out.println("============================================");
                     System.out.println("Error! First number must be greater than second number.");
                     System.out.println("============================================");
                     System.out.println();
                 }
                 else{
                     System.out.println("============================================");
                     System.out.println("Answer : "+answ);
                     System.out.println("============================================");
                     System.out.println();
                 }
                 break;
            default:
            System.out.println("============================================");      
            System.out.println("Invalid Operator!");
            System.out.println("============================================");      
            System.out.println("============================================");      
            System.out.println("Error");
            System.out.println("============================================");      
        } 
                }while(operator != 6 );
            
        }catch(InputMismatchException e){
            System.out.println("============================================"); 
            System.out.println("Enter correct choice!");
            System.out.println("============================================"); 
            System.out.println("============================================"); 
            System.out.println("Enter only number! ");
            System.out.println("============================================"); 
        }       
        
    }
    
    
}