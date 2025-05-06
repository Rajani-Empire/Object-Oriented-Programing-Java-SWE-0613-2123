public class EvenOddSrize {
    public static void main(String[] args) {
        
        //For loop
        System.out.println("Odd Number : ");
        for(int i=1;i<=20;i=i+2){
          System.out.print(+i+" ");
        }

        System.out.println();
        System.out.println("Even Number : ");
        for(int i=2;i<=20;i=i+2){
          System.out.print(+i+" ");
        }

        System.out.println();


        //while
        int i=1;
        System.out.println("Odd Number : ");
        while(i<=20)
        {
            System.out.print(+i+" ");
            i=i+2;
        }

        System.out.println();
       


        int j=2;
        System.out.println("Even  Number : ");
        while(j<=20)
        {
            System.out.print(+j+" ");
            j=j+2;
        }


        
        //do while
        System.out.println();
        System.out.println("Odd Number : ");
        int k=1;
        do{
           
          System.out.print(+k+" ");
          k=k+2;

        }
        while(k<=20);



        System.out.println();
        System.out.println("Even Number : ");
        int m=2;
        do{
           
          System.out.print(+m+" ");
          m=m+2;

        }
        while(m<=20);



    }
    
}
