class Grandparent{
    void gdisplay(){
        System.out.println("This is method of Grandparent class");
    }
    public static void main(String[] args){
        Child obj1 = new Child();
        Parent obj2 = new Parent();
        Grandparent obj3 = new Grandparent();
        obj1.cdisplay();
        obj1.pdisplay();
        obj1.gdisplay();
        obj2.pdisplay();
        obj2.gdisplay();
        obj3.gdisplay();
    }
}
class Parent extends Grandparent{
    void pdisplay(){
        System.out.println("This is method of Parent class");
    }
}
class Child extends Parent{
    void cdisplay(){
        System.out.println("This is method of Child class");
    }
}
// class MultilevelInheritance{
//     public static void main(String[] args){
//         Child obj1 = new Child();
//         Parent obj2 = new Parent();
//         Grandparent obj3 = new Grandparent();
//         obj1.cdisplay();
//         obj1.pdisplay();
//         obj1.gdisplay();
//         obj2.pdisplay();
//         obj2.gdisplay();
//         obj3.gdisplay();
//     }
// }