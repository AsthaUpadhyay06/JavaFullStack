// public class practicequestion {
//     public static void main(String[] args) {
//         int n=4;
//         for(int i=n; i>0;i--){
//             for(int j=0;j<i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }
 // write a program to print first even number

import java.util.Arrays;

public class practicequestion {
//    public static void main(String[] args) {
//     int sum=0;
//      int n=4;
//     for(int i=0; i<n;i++){
//         sum=sum+i*2;
        
           
//         }
//          System.out.println(sum);
//    }



// practice 3

// public static void main(String[] args) {
//     int n=5;
//     int table;
//     for(int i=1;i<=10;i++){
//         table=n*i;
//         System.out.println(table);


//     }
    
// }

//reverse 
// int n=5;
//     int table;
//     for(int i=10;i>1;i--){
//         table=n*i;
//         System.out.println(table);


//     }
    
// }


// factorial using while loop
// public static void main(String[] args) {
//  int n=5;
//  int f=1;
//  int i=1;
//  while(i<=n){
//     f=f*i;
//     i++;
//  }
// System.out.println(f);
//     }
    
 //practice question 6


// public static void main(String[] args) {
//     int n=8;
//     int table;
//     int sum=0;
//     for(int i=1;i<=10;i++){
//         table=n*i;
//         sum=sum+table;
//     }
//     System.out.println("sum is : " +sum);
// }

// public static void main(String[] args) {
//     int [] marks={34,56,76,43,22};
//     // System.out.println(marks[4]);
//     // System.out.println(marks.length);
//     for(int i=0;i<marks.length;i++){
//         System.out.println(marks[i]);
//     }
//     System.out.println();
//     for(int i=marks.length-1;i>=0;i--){
//         System.out.println(marks[i]);
//     }
// }

//for each loop 
// public static void main(String[] args){
// int [] marks={34,56,76,43,22}; {
//     for(int i:marks){
//         System.out.println(i);
//     }
// }
// }

// multidimentional array =>are array of arrays
  
// public static void main(String[] args) {
//     int [] marks;  //A 1-D Array
//     int [][] flats; //B 2-D Array
//     flats=new int [2][3];
//     flats[0][0]=101;
//     flats[0][1]=102;
//     flats[0][2]=103;

//     flats[1][0]=201;
//     flats[1][1]=202;
//     flats[1][2]=203;
//     for(int i=0;i<flats.length;i++){
//         for(int j=0;j<flats[i].length;j++){
//             System.out.print(flats[i][j]);
//             System.out.print(" ");
//         }
//         System.out.println("");
//     }
// }
 // array practice 

// public static void main(String[] args) {
    
//  float[] marks={23.4f,45.5f,67.5f,42.5f,34.5f};
//  float sum=0;
//  for(float i=0;i<marks.length;i++){
//     sum=sum+i;
//  }
//  System.out.println("sum is " +sum);
// }


// public static void main(String[] args) {
//     int marks[]={23,454,66,32,23};
//     int num=4547;
//     boolean isInArray=false;
//     for(int element:marks){
//         if(num==element){
//             isInArray=true;
//             break;
 
//         }}

//         if(isInArray){
//             System.out.println("true present haii");
//         }
//         else{
//             System.out.println("not prersent");
//         }
    
// }


// array prblm 3 

// public static void main(String[] args) {
//     float[] marks={23.4f,45.5f,67.5f,42.5f,34.5f};
//  float sum=0;
//  int average;
//  for(float i=0;i<marks.length;i++){
//     sum=sum+i;
    
//  }
//  System.out.println("average " +sum/marks.length);
// }

// practice problem 4

// public static void main(String[] args) {
//     int [][] mat1={{1,2,3},
//                    {4,5,6}};
//     int [][] mat2 ={{7,8,9},
//                     {10,11,12}};
//     int [][] result={{0,0,0},
//                       {0,0,0}};
//       for(int i=0;i<mat1.length;i++){
//         for(int j=0;j<mat1[i].length;j++){
//           result[i][j]=mat1[i][j]+mat2[i][j];
//   System.out.print(result[i][j]);
//   System.out.print(" ");
//         }
//         System.out.println();
//       }                
// }
    
 //reverse array elements
// public static void main(String[] args) {
//   int [] arr={1,2,3,4,5,6,56,43,455};
//   int l=arr.length;
//   int temp;
//   int n=Math.floorDiv(l, 2);
//   for(int i=0;i<n;i++){
//     temp=arr[i];
//     arr[i]=arr[l-i-1];
//     arr[l-i-1]=temp;

    
//   }
//   for(int element:arr){
//     System.out.print(element + " ");
//   }
  
// }

// public static void main(String[] args) {
//   int [] arr={1,2,3,4,5,666,56,43,455};
//   int max=0;
//   for(int i=0;i<arr.length;i++){
//   if(arr[i]>max){
//     max=arr[i];
//   }
//   }
//   // System.out.println("maximum is " + max);
 
//   System.out.println(Integer.MAX_VALUE);
//     System.out.println(Integer.MIN_VALUE);

// }


public static void main(String[] args) {
  int [] arr={1,2,3,4,5,666,56,43,455};
  // int temp;
//   for(int i=0;i<arr.length-1;i++){
//     for(int j=i+1;i<arr.length;j++){
// if(arr[i]>arr[i+1]) {
//   temp=arr[i];
//   arr[i]=arr[i+1];
//   arr[i+1]=temp;
//   }
Arrays.sort(arr);

//  }
 
//   }
   for(int element : arr){
    System.out.println(element);
   }
// }
}
}
  
    