import java.util.Scanner;

public class MADLiBS {
    //  MAD LIBS GAME
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    String  name;
    String study;
    String college;
    String profession;
    String place;


    System.out.println("enter your name");
    name=sc.nextLine();
    System.out.println("enter your study");
    study=sc.nextLine();
    System.out.println("enter your college name");
     college=sc.nextLine();
    System.out.println("enter your profession");
    profession=sc.nextLine();
    System.out.println("enter your place at which you want to work");
    place=sc.nextLine();
     

    System.out.println("Hello Iam "+ name );
    System.out.println("Iam currently persuing "+ study );
    System.out.println("At " +college);
    System.out.println("Iwant to become a " + profession);
    System.out.println("At "+place);
    }
    
}
