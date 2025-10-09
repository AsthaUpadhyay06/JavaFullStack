import java.util.Scanner;

public class compoundinterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        double principal;
        double rate;
        double time;
        int years;
        double amount;

        System.out.println("Enter the principal amount");
        principal=sc.nextDouble();
        System.out.println("Enter the rate of interest");
        rate=sc.nextDouble()/100;
        System.out.println("Enter the time in years");
        time=sc.nextDouble();
        System.out.println("Enter the number of times interest applied per time period");
        years=sc.nextInt();
        amount=principal*Math.pow((1+rate/years),years*time);

        System.out.println( "amolunt is " + amount);

    }
}
