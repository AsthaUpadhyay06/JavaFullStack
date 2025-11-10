 
 class Base1{
     Base1(){
        System.out.println("Hello iam base class default constructor!!");
     }
     Base1(int x){
        System.out.println("Hey iam Base class constructor with argument " + x);
     }
 }
 class Derived extends Base1{
    Derived(){
        System.out.println("hello iam deriveed class  default constructor ");
    }
    Derived(int x,int y){
        super(x);
        System.out.println("hey iam derived class constructor with argument " +  " " + y);
    }
 }

 class childofDerived extends Derived{
    childofDerived(){
        System.out.println("hello iam childofderiveed class  default constructor ");
    }
   childofDerived(int x,int y,int z){
        super(x,y);
        System.out.println("hey iam childofDerived class constructor with argument " +  " " + z);
    }
 }

public class inheritanceconstructor {
    public static void main(String[] args) {
        // Base1 b1=new Base1();
        // Derived d1=new Derived(3,4);
        childofDerived c1=new childofDerived(3,4,4);


    }
}
