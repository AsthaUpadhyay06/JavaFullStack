import java.util.Random;
import java.util.Scanner;

public class randomnumber {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner sc=new Scanner(System.in);
        int guess;
        int attemps=0;
        int randomnumber=random.nextInt(1,11);
        System.out.println("guessing number");
        System.out.println("guessing number from 1 to 11");
        do{
            System.out.println("enter a guess");
            guess=sc.nextInt();
            attemps++;
            if(guess<randomnumber){
                System.out.println("too low");
            }
            else if(guess>randomnumber){
                System.out.println("too high");
            }
            else{
                System.out.println("correct guess");
                System.out.println(randomnumber);
                System.out.println("attemps" +attemps);
            }

        }while(guess!=randomnumber);
        System.out.println("you won the game");
      

    }
}
