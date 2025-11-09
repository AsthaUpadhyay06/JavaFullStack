
// class Rectangle{
//     int length;
//     int breadth;
// //   public Rectangle(int l,int b){
// //     length=l;
// //     breadth=b;
// //   }
//     public int perimeter(){
//          return  2*(length+breadth);
//     }
// }
// public class practicequestion2 {
//     public static void main(String[] args) {
//         Rectangle obj=new Rectangle();
//         obj.breadth=4;
//         obj.length=2;
//     System.out.println(obj.perimeter());
//     }
// }
   

//practice question 2



// class circle{
//     double radius;
//      public circle(int r){
//       radius=r;
//      }

//      public double getArea(){
//     return 3.14*radius*radius;
//      }
// }
// public class practicequestion2{
//     public static void main(String[] args) {
//         circle obj=new circle(2);
//         System.out.println(obj.getArea());
//     }
// }

//   class book{
//       String title;
//       int price;

//       public void setTitle(String t){
// title=t;

//       }
//       public void setPrice(int p){
//        price=p;
//       }
//      public String getTitle(){
//         return title;
//      }
//      public int getPrice(){
//        return price;
//       }

//   }

// public class practicequestion2{
//     public static void main(String[] args) {
//         book obj=new book();
//         obj.setPrice(5000);
//         obj.setTitle("new life");
//         System.out.println(obj.getTitle());
//         System.out.println(obj.getPrice());

//         obj.setPrice(1000);
//         obj.setTitle("Non your business");

//         System.out.println(obj.getPrice());
//        System.out.println( obj.getTitle());
//     }
// }



//practice question 4
  

// class student{

//     String name;
//         int rollno;
//     public student(String n,int r){
//         name=n;
//         rollno=r;
        
//          System.out.println("without parameter");
//     }
    
//      public student(String n){
//        name=n;
//        rollno=1;
       
//     }
    
    
    

// }
  
//  public class practicequestion2{
//     public static void main(String[] args) {
//         student obj=new student("astha",101);
//         student obj2=new student("riya");
//         System.out.println(obj.name+" " + obj.rollno );
//         System.out.println(obj2.name+" " +obj2.rollno );

    

         
//     }
//  }

//   class employee{
//     private  int salary;

//     public employee(int s){
//     salary=s;
//     }

//     public void setSalary(int s){
//         salary=s;
//     }
//     public int getSalary(){
//         return salary;
//     }
//   } 
// public class practicequestion2{
//     public static void main(String[] args) {
//       employee obj=new employee(50000);
//       System.out.println("initial salary " + obj.getSalary());
//       obj.setSalary(25000);
//       System.out.println("new salary " + obj.getSalary());

//     }
//} 

// class square{
//     int side;
//     public square(int s){
//         side=s;
//     }
//     public int perimeter(){
//  return 4*side;
//     }
// }

//   public class practicequestion2{
//     public static void main(String[] args) {
//         square obj=new square(4);
//     System.out.println( obj.perimeter());
//     }
//   }



//   class laptop{
//     String brand;
//     int price;


//     public laptop(String b,int p){
//         brand=b;
//         price=p;
//         System.out.println("brand " + b + " price "+ p);
//     }
//     public laptop(String b){
//         brand=b;
//         price=10000;
//         System.out.println( "brand " + b + "price " + price);
//     }
//   }
//   public class practicequestion2{
//     public static void main(String[] args) {
//          laptop obj=new laptop("oppo",15000);
//           laptop obj1=new laptop("hp");


//     }
//   }

//  class cylinder{
//     int radius;
//     int height;
//     public  cylinder(int r,int h){
//        radius=r;
//        height=h;
//     }

//      public void setRadius(int r){
//         radius=r;

//      }

//           public void setHeight(int h){
//         height=h;
        
//      }

//      public int radiii(){
//      return radius;
//      }

//      public int heiii(){
//      return height;
//      }

//      public double surfacearea(){
//       return 2*3.14*radius*radius+2*3.14*radius*height;
//      }
//      public double volume(){
//         return 3.14*radius*radius*height;
//      }
//  }
//  public class practicequestion2{
//     public static void main(String[] args) {
//          cylinder c1=new cylinder(9,12);
//         //  c1.setHeight(12);
//         //  c1.setRadius(9);
//          System.out.println(c1.radiii());
//          System.out.println(c1.heiii());
//          System.out.println(c1.surfacearea());
//          System.out.println(c1.volume());
//     }
//  }


//}
// 

 class Rectangle{
    private int length;
    private int breadth;

    public Rectangle(int l,int b){
        length=l;
        breadth=b;
    }
     public Rectangle(){
        length=4;
        breadth=5;
    }
    public int getLength(){
        return length;

    }
    public int getBreadth(){
        return breadth;
    }
 }

 public class practicequestion2{
    public static void main(String[] args) {
        
        Rectangle obj=new Rectangle(2,7);
        Rectangle obj2=new Rectangle();
        System.out.println(obj.getLength());
        System.out.println(obj2.getLength());
        System.out.println(obj.getBreadth());
        System.out.println(obj2.getBreadth());
        

    }
}