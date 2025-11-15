import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
       char firstdigit=num.charAt(0);
       int first=firstdigit-'0';
       if(first%2==0){
        System.out.println("EVEN");
       }
       else{
        System.out.println("ODD");
       }
          
        

    }
}
