class PracticeProblem01{

    public class TriangleArea{
        public static double calculate(double base,double height){
            return 0.5*base*height;
        }
    }

    public class BallVolume{
        public static double calculate(double radius){
            //4/3 * pi * radius^3
            return (4/3)* Math.PI*Math.pow(radius,3);
        }
    }


    
    public class CircleArea{
        public static double calculate(double radius){
            return Math.PI*Math.pow(radius,2);
        }
    }


    public class CelsiusToFahrenheit{
        public static double calculate(double celsious){
            return ((celsious/5)*9)+32;
        }
    }



    public class EquilateralTriangleArea{
        public static double calculate(double arm){
            return (Math.sqrt(3)/4)*Math.pow(arm,2) ;
        }
    }


    public class HeronTriangleArea{
        public static double calculate(double a,double b,double c){
            double s=(a+b+c)/2;
            return Math.sqrt(s*(s-a)*(s-b)*(s-c)) ;
        }
    }



      public static void main(String args[]){
        System.out.println("Triangle area : "+ TriangleArea.calculate(3,4));
        System.out.println("Ball Volume: " + BallVolume.calculate(3));
        System.out.println("Circle Area: " + CircleArea.calculate(3));
        System.out.println("Celsius to Fahrenheit: " + CelsiusToFahrenheit.calculate(25));
        System.out.println("Equilateral Triangle Area: " + EquilateralTriangleArea.calculate(4));
       

      }
}