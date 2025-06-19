interface numone{
   public void eat();
}
interface numtwo{
    public void eat2();
}
public class MultipleInheritance implements numone,numtwo{
    public void eat(){
        System.out.println("First interface is eating");
    }
    public void eat2(){
        System.out.println("Second class is eating");
    }
    public static void main(String[] args){
        MultipleInheritance c = new MultipleInheritance();
        c.eat();
        c.eat2();
    }
}