
public class MethodOverloading {
    public int pro(int a, int b){
        return a * b;
    }
    public float pro(float a,float b){
        return a * b;
    }
    public int pro(int a,int b,int c){
        return a * b * c;
    }
    public static void main(String[] args){
        MethodOverloading myobj = new MethodOverloading();
        // pro1 = myobj.pro(4,5);
        System.out.println("Multiplication using 2 int:"+(myobj.pro(4,5)));
        System.out.println("Multiplication using 2 float:"+(myobj.pro(23.98f,9.7f)));
        System.out.println("Multiplication using 3 int:"+(myobj.pro(7,8,13)));
    }
}
