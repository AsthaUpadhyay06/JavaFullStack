import java.util.Scanner;

public class BrothersCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First person's names
        String F1 = sc.next();
        String S1 = sc.next();

        // Second person's names
        String F2 = sc.next();
        String S2 = sc.next();

        // Compare second names
        if (S1==S2) {
            System.out.println("ARE Brothers");
        } else {
            System.out.println("NOT");
        }
    }
}
