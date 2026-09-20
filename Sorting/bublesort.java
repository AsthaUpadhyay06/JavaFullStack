package Sorting;
// public class bublesort {
//     public static void main(String[] args) {
//         int arr[]={2,5,7,3,4,1};
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
        
// for(int i=0;i<arr.length;i++){
//     System.out.print(arr[i]+ " ");
// }
        
//     }
    
// }


//OPTIMAL APPROACH


// public class bublesort {
//     public static void main(String[] args) {
//         int arr[]={1,0,-2,3,0,4,8,0,10,12};
//         boolean isSorted=false;
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]>arr[j+1] ){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                     isSorted=true;
//                 }
//             }
//             if(isSorted==false){
//                 break;
//             }
//         }
        
        
// for(int i=0;i<arr.length;i++){
//     System.out.print(arr[i]+ " ");
// }
        
//     }
    
// }


//MOVE ALL ZEORES TO END 

public class bublesort {
    public static void main(String[] args) {
        int arr[]={1,0,-2,3,0,4,8,0,10,12};
        boolean isSorted=false;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]==0 ){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSorted=true;
                }
            }
            if(isSorted==false){
                break;
            }
        }
        
        
for(int i=0;i<arr.length;i++){
    System.out.print(arr[i]+ " ");
}
        
    }
    
}