
public class Shape {
    public void area(){
        System.out.println("This is the area of the given shape");
    }
    public static void main(String[] args){
        Shape s1 = new Circle();
        Shape s2 = new Rectangle();
        s1.area();
        s2.area();
    }

}
class Circle extends Shape{
    public void area(){
        System.out.println("This is the area of the circle");
    }
}
class Rectangle extends Shape{
    public void area(){
        System.out.println("This is the area of the rectangle");
    }
}