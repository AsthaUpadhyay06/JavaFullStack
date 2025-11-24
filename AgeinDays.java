import java.util.Scanner;

public class AgeinDays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int Years=N/365;
        int Remaining=N%365;
        int months=Remaining/30;
        int days=Remaining%30;
        System.out.println(Years + " years");
         System.out.println(months + " months");
          System.out.println(days+ " days");
    }
}
