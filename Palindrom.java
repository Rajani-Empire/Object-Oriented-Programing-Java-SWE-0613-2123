import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();


        String rev = new StringBuilder(s).reverse().toString();


        System.out.println("reverse string : "+rev);

        if(s.equals(rev)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not a Plindrom");
        }

        
    }
    
}
