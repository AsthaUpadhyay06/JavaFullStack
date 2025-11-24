import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        // System.out.println(Math.PI);
        // System.out.println(Math.E);
        // double result;
        // result=Math.pow(2,3);
        // System.out.println(Math.abs(-4));
        // System.out.println(result);
        // System.out.println(Math.sqrt(5));
        // System.out.println(Math.round(34.44));
        // System.out.println(Math.ceil(34.344));
        // System.out.println(Math.floor(3.4434));
        
        // System.out.println(Math.min(10,30));

        Scanner sc=new Scanner(System.in);
        // double a;
        // double b;
        // double c;

        // System.out.println("Enter the length of side A");
        // a=sc.nextDouble();
        // System.out.println("enter te length of side B ");
        // b=sc.nextDouble();

        // System.out.println("Calculating hypotenuse");
        //  c=Math.sqrt(a*a +b*b); //Math
        //  System.out.println("The length of hypotenuse is " +c);

         double radius ;
         double circumference;
         double area;
         double volume;

          System.out.println("enter the radius");
           radius=sc.nextDouble();
            circumference=2*Math.PI*radius;

            System.out.println("circumference is " +circumference);

            area=Math.PI*Math.pow(radius,2);
            System.out.println("area is " +area );
   

            volume =(4.0/3.0)*Math.PI*Math .pow(radius,3);
            System.out.println("volume is " +volume);
           
           


    }
}
