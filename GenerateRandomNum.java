import java.util.Random;

public class GenerateRandomNum {
    public static void main(String[] args) {
        Random random=new Random();
        int num;
        num=random.nextInt(1,5);
        System.out.println(num);
    ;

    }
}
