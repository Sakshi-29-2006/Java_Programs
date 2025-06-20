class Mydemo{
    public void display(){
        System.out.println("This is mydemo method");
    }
}
class NextDemo extends Mydemo{
    public void display(){
        System.out.println("This is nextdemo method");
    }
}
public class PolyDemo {
    public static void main(String[] args){
        Mydemo obj1 = new NextDemo(); //Overriding of method in child class
        obj1.display();
        Mydemo obj2 = new Mydemo();
        obj2.display();
    }
}
