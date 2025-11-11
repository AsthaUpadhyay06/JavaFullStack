//  class circle{
//   int radius;
//   public void area(int r){
//     radius=r;
//   }
//   public int getarea(){
//     return 22/7*radius*radius;
//   }
//  }
//  class cylinder extends circle{
//      public void cylinder(){
//         System.out.println("hello iam cylinder function");
//      }
//  }


// public class inheritancequestion {
//     public  static void main(String[] args) {
//         circle obj=new circle();
//         obj.area(4);
//         cylinder obj1=new cylinder();
//         obj1.area(4);
//         System.out.println(obj1.getarea());
//         System.out.println(obj.getarea());

//     }
// }


// Real-world style Rectangle
class Rectangle {
    protected double length;
    protected double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth; // Area of rectangle
    }

    public double getPerimeter() {
        return 2 * (length + breadth);
    }
}

// Cuboid extending Rectangle (real-world: box based on a rectangle base)
class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double length, double breadth, double height) {
        super(length, breadth); // reuse rectangle properties
        this.height = height;
    }

    public double getVolume() {
        return length * breadth * height;
    }

    public double getSurfaceArea() {
        return 2 * (length*breadth + breadth*height + height*length);
    }

}

// Testing them

    



  public class inheritancequestion{
    
    
        public static void main(String[] args) {
        Rectangle tableTop = new Rectangle(5, 3);
        System.out.println("Table Top Area: " + tableTop.getArea());
        System.out.println("Table Top Perimeter: " + tableTop.getPerimeter());

        Cuboid cardboardBox = new Cuboid(5, 3, 4);
        System.out.println("\nCardboard Box Volume: " + cardboardBox.getVolume());
        System.out.println("Cardboard Box Surface Area: " + cardboardBox.getSurfaceArea());
    }
  }


