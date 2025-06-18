public class AddParaConst {
    int num1;
    int num2;
    public AddParaConst(int m, int n){
        num1 = m;
        num2 = n;
    }
    public void sum(){
        System.out.println("Addition is:"+(num1 + num2));
    }
    public static void main(String[] args){
        AddParaConst tot = new AddParaConst(89, 96);
        tot.sum();
    }
}
