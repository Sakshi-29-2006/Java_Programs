public class Recursion {
    public static int  recfact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else {
            return n * recfact(n - 1);
        }
    }
    public static void main(String[] args){
        int fact = recfact(6);
        System.out.println("Fact using rec:"+fact);
    }
}
