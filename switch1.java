import java.util.Scanner;

public class switch1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("write whatever you want ");
        String str=sc.nextLine();
        switch(str){
            case "monday","tuesday" : System.out.println("it is a working day");
            break;
            case "saturday ","sunday" : System.out.println("it is a weekend");
            break;
            default : System.out.println("holiday");

        }
    }

}
