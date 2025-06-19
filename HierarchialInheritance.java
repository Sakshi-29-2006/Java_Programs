class Parent{
    public void pmethod(){
        System.out.println("This is Parent class");
    }
}
class Child1 extends Parent{
    public void c1method(){
        System.out.println("This is 1st child class");
    }
}
class Child2 extends Parent{
    public void c2method(){
        System.out.println("This is 2nd child class");
    }
}
public class HierarchialInheritance {
    public static void main(String[] args){
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();
        Parent obj3 = new Parent();
        obj1.c1method();
        obj1.pmethod();
        obj2.c2method();
        obj2.pmethod();
        obj3.pmethod();
    }
}
