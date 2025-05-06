import java.util.*;

public class GradeCalculate {
    public static void main(String[] args) {
        System.out.print("Enter Your Marks : ");

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String grade;

        if(num<0  ||  num>100){
            grade = "Invalid marks!";
        }
        else if(num<40){
            grade = "F";
        }
        else if(num>=40 && num<60){
            grade = "C+";
        }
        else if(num>=60 && num<70){
            grade = "B";
        }
        else if(num>=70 && num<80){
            grade = "A-";
        }
        else if(num>=80 && num<90){
            grade = "A";
        }
        else {
            grade = "A+";
        }


        System.out.println("Your Grade : "+grade);
        
    }
    
}
