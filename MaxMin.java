import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
       int Min= Math.min(a, Math.min(b,c));
       int Max= Math.max(a, Math.max(b,c));
       System.out.println(Min + " " + Max);

        
    }
}
