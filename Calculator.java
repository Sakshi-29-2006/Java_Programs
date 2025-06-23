public class Calculator {
    int num1;
    int num2;
    public Calculator(int a,int b){
        num1 = a;
        num2 = b;
    }
    public void show(){
        System.out.println("Addition: "+(num1 + num2));
        System.out.println("Subtraction: "+(num1 - num2));
        System.out.println("Multiplication: "+(num1 * num2));
        System.out.println("Division: "+(num1 / num2));
    }
    public static void main(String[] args){
        Calculator obj1 = new Calculator(64, 7);
        obj1.show();
    }
}
