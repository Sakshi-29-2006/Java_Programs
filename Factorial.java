public class Factorial {
    public static int fact(int a){
        int i;
        int res = 1;
        for(i = a;i >= 1;i--){
             res *= i;
        }
        return res;
    }
    public static void main(String[] args){
        int factorial = fact(5);
        System.out.println("Factorial is:"+factorial);
    }
}
