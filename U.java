import java.util.*;

public class U {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();  // input as string lo

        if (N.contains(".")) {  // agar . hai to float ho sakta hai
            String[] parts = N.split("\\.");
            String integer = parts[0];
            String decimal = parts[1];

            // Agar decimal part pure zero ho → integer
            if (Integer.parseInt(decimal) == 0) {
                System.out.println("int " + integer);
            } else {
                System.out.println("float " + integer + " 0." + decimal);
            }

        } else { 
            // Agar . nahi hai → definitely integer
            System.out.println("int " + N);
        }
    }
}
