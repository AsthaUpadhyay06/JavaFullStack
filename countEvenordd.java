public class countEvenordd {
    
    public static void main(String[] args) {
        int [] arr={12,33,22,56,43,79,43,47};
        int even=0;
        int odd=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
               even++;
            }
            else{
             
               odd++;
             }
            
        }
        System.out.println("even " + even);
        System.out.println("odd "+ odd);
    }

}
