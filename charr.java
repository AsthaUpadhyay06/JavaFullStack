import java.util.Scanner;


public class charr {

 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
char ch = sc.next().charAt(0);

if (Character.isLowerCase(ch)) {
    ch = Character.toUpperCase(ch);   // lower → upper
} 
else if (Character.isUpperCase(ch)) {
    ch = Character.toLowerCase(ch);   // upper → lower
}

System.out.println(ch);


 }
        
 
}