public class secondlargest {
//     Find the Second Largest Element
public static void main(String[] args) {
    int arr[]={34,56,43,122,56,32};
    
    int largest=0;
    int secondlargest=0;
    for(int i=0;i<arr.length;i++){
       if(arr[i]>largest){
       secondlargest =largest;
       largest=arr[i];

       }
       else if(arr[i]>secondlargest && largest!=arr[i]){
         secondlargest =largest;
        }
    
    }
    System.out.println("largest " +largest);
    System.out.println("secondlargest " + secondlargest);
}

   
}
// 

