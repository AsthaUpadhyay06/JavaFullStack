import java.util.Scanner;
//new try
public class SimpleCalculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(x + " + " + y + " = " + (x + y));
        System.out.println(x + " * " + y + " = " + ((long)x * y)); // cast to long to avoid overflow
        System.out.println(x + " - " + y + " = " + (x - y));
    }
}



