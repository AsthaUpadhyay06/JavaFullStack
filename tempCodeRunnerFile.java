class Phone {
     public void music(){
         System.out.println("muisc.....");
     }
     public void listening(){
        System.out.println("listeninggg");
     }
 }
 class smartphone extends Phone{
    public void listenmusic(){
         System.out.println("muisc.....");
     }
     public void listening(){
        System.out.println("listeninggg music  ");
     }
 }
public class inheritanceconstructor{
    public static void main(String[] args) {
         Phone p1=new smartphone();
         p1.listening();
         p1.music();
        //  p1.listeningmusic(); // not allowed
        
    }
}