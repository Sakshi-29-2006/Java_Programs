class Firstclass{
    public void show(){
        System.out.println("This is method of firstclass");
    }
}
class Secondclass extends Firstclass{
    public void show(){
        super.show(); //using method of parent class before child class
        System.out.println("This is method of secondclass");
    }
}
class Thirdclass extends Firstclass{
    public void show(){
        super.show();
        System.out.println("This is method of thirdclass");
    }
}
public class PolyWithSuper {
    public static void main(String[] args){
    Firstclass obj = new Secondclass(); // outputs methods of secondclass i.e This is method of firstclass
// This is method of secondclass
    Firstclass obj1 = new Firstclass(); // outputs this is method of firstclass
    Secondclass obj2 = new Secondclass();
    Thirdclass obj3 = new Thirdclass();
    obj.show();
    obj1.show();
    obj2.show();
    obj3.show();

    }
}