
// public class Selectionsort {
//     public static void main(String[] args) {
//         int[] arr={23,-5,5,75,42,45,6,-1,0};
//         int min;
//         int temp=0;
//         for(int i=0;i<arr.length;i++){
//             min=i;
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[j]<arr[min]){
//                     min=j;

              
//             }
           
//         }
//         temp=arr[i];
//             arr[i]=arr[min];
//             arr[min]=temp;
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+ " ");
//         }
//     }
    
// }

// public class Selectionsort {
//     public static void main(String[] args) {
//         int[] arr={23,-5,5,75,42,45,6,-1,0};
       
//         int temp=0;
//         for(int i=arr.length-1;i>0;i--){
//              int max=i;
//             for(int j=i-1;j>=0;j--){
        
//                 if(arr[j]>arr[max]){
//                     max=j;
//                 }
              
//             }
//         temp=arr[i];
//             arr[i]=arr[max];
//             arr[max]=temp;
//         }
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+ " ");
//         }
//     }
    
// }



//COMMON ELEMENTSS

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 1, 1, 4, 5, 5};
        int[] brr = {6, 1, 1, 4, 4, 2, 8, 2};

        Arrays.sort(arr);
        Arrays.sort(brr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(brr));
        int i=0;
        int j=0;
        while(i<arr.length && j<brr.length ){
            if(arr[i]==brr[j]){
                System.out.print(arr[i] + " ");
                i++;
                j++;
            }
            else if(arr[i]<brr[i]){
                i++;
            }
            else{
                j++;
            }
        }
      
    }
}