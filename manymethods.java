// public class methodoverloading {
//     // static void change(int a){
//     //      a=44;
//     //     System.out.println("hey iam method");
//     // }
//     // static void change33(int [] arr){
//     //     arr[0]=87;
//     // }
//     // public static void main(String[] args) {
//     //     // teelyjoke();
       
//     //     // Case 1 "changing the interger"
//     //     // int x=45;
//     //     // change(x);
//     //     // System.out.println(x);

//     //     // Case 1 "changing the interger"
//     //      int [] arr={34,555,44,334,56,432};
//     //      change33(arr);
//     //      System.out.println(arr[0]);
//     // }

// //     methodoverloading => two or more methods have same name but different paarameters

// static  void method1(){
//    System.out.println("gm");
// }
// static  void method1(int a){
//    System.out.println("" + a);
// }
// static  int method1(int a,int b ){
//    System.out.println(""+a );
//    return 5;
// } 
// public static void main(String[] args) {
//     method1();
//     method1(344);
//    System.out.println( method1(34,44)); // arguments are actual!!

// }
//  }


// var_arguments
public class manymethods{
    static int sum(int ...arr){
 int result=0;
 for(int i:arr){
    result+=i;

 }
 return result;

}
public static void main(String[] args) {
    System.out.println("welcome to var_arguments");
    System.out.println(sum());
    System.out.println(sum(4,6));
    System.out.println(sum(4,6,10));
}


}




