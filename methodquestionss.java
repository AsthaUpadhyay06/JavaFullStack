public class methodquestionss {
    // static int  fact(int n){
    //     if(n==0){
    //        return 1;
    //     }
    //     else{
    //         return n*fact(n-1);
    //     }
        


    // }
    // public static void main(String[] args) {
    //     int n=5;
    //     System.out.println(fact(n));
    // }


// static void multiplication(int n){
//     for(int i=0;i<=10;i++){
//     System.out.println(n*i);
//     }


// }
    
//     public static void main(String[] args) {
//         int n=5;
//        multiplication(n);
        
//     }



//write a program to print pattern

static void pattern(int n){
for(int i=0;i<n;i++){
    for(int j=0;j<i+1;j++){
 System.out.print("*");

    }
   System.out.println();
}

}
public static void main(String[] args) {
    int n=5;
    pattern(n);
}
}
