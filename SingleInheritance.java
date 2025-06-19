class Parent{
    void display(){
        System.out.println("Hello this is parent class");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("Hello this is child class");
    }
}
public class SingleInheritance {
    public static void main(String[] args){
        Child obj1 = new Child();
        Parent obj2 = new Parent();
        obj1.display();
        obj1.show();
        obj2.display();
    }
}
