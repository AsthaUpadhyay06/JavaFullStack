abstract class Parent{
    abstract public void dog();
    public void animal(){
        System.out.println("this is a normal method");
    }

}
 class Child extends Parent{
    public void dog(){
        System.out.println("hello iam override called by subclass(child class)");
    }
    public void normal(){
        System.out.println("hello iam again normal class");
    }


}

public class Abstractclass {
    public static void main(String[] args) {
        Parent p1=new Child();
        p1.animal();
        p1.dog();
        
    }
}
