public class ifelse {
    public static void main(String[] args) {
        boolean isStudent=false;
        boolean isSenior=false;
        int price=45;
        if (isStudent){
            if(isSenior){
                System.out.println("agar upar vala chala toh ye chalega");
           price +=4;
            }
            
            else{
                System.out.println("abhi nhi pta kya hoga");
                price +=3;
            }
        }
        else{
            if(isSenior){
                System.out.println("else vala if  chalega");
                price +=2;
            }
            else{
                System.out.println("nhhi to else chaslegs");
                price +=1;
            }
        }
System.out.println("student price is "+ price);

    }
}
