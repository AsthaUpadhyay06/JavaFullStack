import java.util.Scanner;

public class sortnum {
   
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A =sc.nextInt();
        int B =sc.nextInt();
        int C =sc.nextInt();
        int originalA = A;
        int originalB = B;
        int originalC = C;
        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }
        if (A > C) {
            int temp = A;
            A = C;
            C = temp;
        }
        if (B > C) {
            int temp = B;
            B = C;
            C = temp;
        }
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        System.out.println();  // blank line

        // Print original values
        System.out.println(originalA);
        System.out.println(originalB);
        System.out.println(originalC);

    }
}

