import java.util.*;

public class BuildCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a :");
        int a = sc.nextInt();
        System.out.print("Enter the number b :");
        int b = sc.nextInt();

        System.out.print("Enter the Operator : ");
        char ch = sc.next().charAt(0);

        if(ch == '+'){
            System.out.println("Answer : "+(a+b));
        }
        else if(ch == '-'){
            System.out.println("Answer : "+(a-b));
        }
        
        else if(ch == '*'){
            System.out.println("Answer : "+(a*b));
        }

        else{
            if(b != 0){
                System.out.println("Answer : "+(a/b)); 
            }
            else{
                System.out.println("Invalid");
            }
        }

        
    }
    
}
