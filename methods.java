public class methods {
 static int fun(int x,int y){
    int z;
    return x+y;
  }
    public static void main(String[] args) {
        int a=6;
        int b=9;
      methods obj=new methods();
      int c=fun(a,b);
      System.out.println(c);
    }
}