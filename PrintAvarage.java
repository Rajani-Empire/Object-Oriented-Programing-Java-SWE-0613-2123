import java.util.*;

public class PrintAvarage {
    public static void main(String[] args) {
        System.out.print("Enter the size array : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.print("Enter the element : ");
        for(int i =0;i<size;i++){
            array[i] = sc.nextInt();

        }
        
        int sum =0;
        for(int i=0;i<size;i++){
          sum = sum+array[i];
        }

        int avarage = sum/size;

        System.out.println("Result : "+avarage);
        
    }
    
}
