public class ClassObj {
    public void greet(){
        System.out.println("Hello first method this side");
    }
    public void greeting(){
        System.out.println("Hii second method this side");
    }
    public static void main(String[] args){
        ClassObj obj1 = new ClassObj();
        obj1.greet();
        obj1.greeting();
    }
}
