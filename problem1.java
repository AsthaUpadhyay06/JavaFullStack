


class Calculator{
    public void Calculate(int a,int b){
System.out.println("your result is"+ a+b);
    }
}
class ScCalculator{
    public void Calculate(int a,int b){
System.out.println("your result is"+ a/b);
    }
}
class HyCalculator{
    public void Calculate(int a,int b){
System.out.println("your result is"+ a*b);
    }
}

public class problem1 {
    public static void main(String[] args) {
        System.out.println("iam mainmethod");
        Calculator c1 = new Calculator();
        ScCalculator c2 = new ScCalculator();
        HyCalculator c3 = new HyCalculator();

        c1.Calculate(10, 5); // + operation wale ke liye
        c2.Calculate(10, 5); // division
        c3.Calculate(10, 5); // multiplication
    }
}
