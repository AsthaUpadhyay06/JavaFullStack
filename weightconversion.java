import java.util.Scanner;

public class weightconversion {
    public static void main(String[] args) {
        //weight conversion problem
Scanner sc=new Scanner(System.in);
double weight;
double newweight;
int choice;



        //welcome message

        System.out.println("welcome conversion program");
        System.out.println("convert lbs to kgs");
        System.out.println("convert lbs to kgs");
        System.out.println("enter choice");
        choice =sc.nextInt();
      if(choice==1){
       
        weight=150;
        newweight=weight*0.45359237;
        System.out.println("conversion of lbs to kgs " + newweight);

      }
      else if(choice==2){
       
        newweight=70;
        weight=newweight*2.20462;
        System.out.println("conversion of kgs to lbs " + weight);

      }

        //promt for choice
        //option 1 convert lbs to kgs
        //option 2 convert kgs to lbs 
        //else print not a valid choice

    }
}
