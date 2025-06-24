public class Threading {
    public static void main(String[] args){
        Thread avg = new Thread(() -> {
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int sum = 0;
            for(int a : arr){
                sum += a;
            }
            double average = sum / 10.0;
            System.out.println("The average of first 10 nos is: "+average);
        });
        Thread square = new Thread(() -> {
            int num = 34;
            int sq = num * num;
            System.out.println("The square of the number is: "+sq);
        });
        try{
            avg.start();
            avg.join();
            square.start();
            square.join();
        }
        catch(InterruptedException e){
            e.getMessage();
        }
    }
}
