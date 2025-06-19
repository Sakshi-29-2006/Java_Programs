interface one{
    public void method1();
}
interface two{
    public void method2();
}
class Parent implements one, two{
    public void method1(){
        System.out.println("This is 1st interface method");
    }
    public void method2(){
        System.out.println("This is 2nd interface method");
    }
    public void pmethod(){
        System.out.println("This is Parent class method");
    }
}
public class HybridInheritance extends Parent{
    public void cmethod(){
        System.out.println("This is child class method");
    }
    public static void main(String[] args){
        HybridInheritance obj = new HybridInheritance();
        obj.method1();
        obj.method2();
        obj.pmethod();
        obj.cmethod();
        Parent obj1 = new Parent();
        obj1.method1();
        obj1.method2();
        obj1.pmethod();
    }
}
