import java.util.Scanner;

public class calculatorcodefor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String exp=sc.next();
        int A =0;
        int  B=0;
         char op = ' ';
        for(char ch : exp.toCharArray()){
  if(ch=='+' || ch=='*' || ch=='/' || ch=='-'){
    op=ch;
   A = Integer.parseInt(exp.substring(0, exp.indexOf(ch)));
                // B is substring after operator
                B = Integer.parseInt(exp.substring(exp.indexOf(ch) + 1));
                break;
  }
         }
         int result = 0;

        if (op == '+') result = A + B;
        else if (op == '-') result = A - B;
        else if (op == '*') result = A * B;
        else if (op == '/') result = A / B;

        System.out.println(result);

    }
}
