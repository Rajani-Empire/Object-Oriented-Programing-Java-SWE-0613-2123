import java.util.*;

public class PracticeProblem01Contd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number> 0){
            System.out.println("Positive Integer");
        }
        else{
            System.out.println("Not a positive Intiger");
        }



        if(number%2==0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
        
    }
    
}
