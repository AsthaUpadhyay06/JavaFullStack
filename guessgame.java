import java.util.Random;
import java.util.Scanner;

class Guess{
private int randomNumber;
 private  int noOfGuess;

    public Guess(){
    Random num=new Random();
    randomNumber=num.nextInt(100)+1;
    noOfGuess=0;

    }
    public int takeUserInput(){
Scanner sc=new Scanner(System.in);
System.out.println("enter your guess");
int input=sc.nextInt();
noOfGuess++;
return input;
    }
    public boolean isCorrectNumber(int guess){
    if(guess==randomNumber){
        System.out.println("correct number" );
        System.out.println("no of guess " +noOfGuess  );
        return  true;}

         else if(guess>randomNumber){
            System.out.println("too high");
        }
        else {
            System.out.println("too low");
        }
        return false;
}


}



public class guessgame {
   public class Main {
    public static void main(String[] args) {

        Guess g = new Guess();
        boolean correct = false;

        while (!correct) {   // Jab tak correct false hai, tab tak chalega
            int userGuess = g.takeUserInput(); // user se guess
            correct = g.isCorrectNumber(userGuess); // check guess
        }
    }
}

}
