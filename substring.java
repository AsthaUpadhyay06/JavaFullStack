import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter email");
        String  str= sc.nextLine();
        String username;
        String domain;

      
        if (str.contains("@")){
            username=str.substring(str.indexOf("@"),23);
              
            System.out.println(username);
            
          domain=str.substring(0,str.indexOf("@"));
         System.out.println(domain);
           
        }
        else{
            System.out.println("invalid kuch nhi print hone vala");
        }
// String email="astha123@gmail.com";
// String username=email.substring(0,email.indexOf("@"));
// String domain=email.substring(email.indexOf("@"));
// System.out.println(username);
// System.out.println(domain);
          



    }
}
