public class SumOfSrize {
    public static void main(String[] args) {
       
       int sumOdd =0;
       for(int i=1;i<=20;i=i+2){
        sumOdd = sumOdd+i;
       }

       System.out.println("Sum of odd srize (1-20): "+sumOdd);

       int sumEven =0;
       for(int i=2;i<=20;i=i+2){
        sumEven  = sumEven +i;
       }

       System.out.println("Sum of even srize (1-20): "+sumEven);

      
    }
    
}
