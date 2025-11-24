import java.util.Scanner;

public class Shoppingcartprogram {
    public static void main(String[] args) {
        //Shoppingcartprogram

        Scanner sc=new Scanner(System.in);
        String item;
        int quantity;
        int price;
        int total;
          System.out.println("Enter what do you like to buy : " );
          item =sc.nextLine();
          System.out.println("Enter how much quantity do you have: " );
          quantity=sc.nextInt();
          System.out.println("This is the price of your item  :" );
          price=sc.nextInt();
           System.out.println("this is the total price of your item : ");
           total=price*quantity;

           System.out.println("Item name is : " + item);
           System.out.println("Item quantity is : " +quantity);
           System.out.println("item price is : " +price);
              System.out.println("Total price is : " +total);
              




 

    }
}
