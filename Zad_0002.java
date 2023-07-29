import java.util.Scanner;

public class Zad_0002 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int sum = 0;
        if(N < 0){
            for(int i = N; i <= 1;i++){
                sum += i;
            }
        }
        if(N > 0){
            for(int i = 0; i <= N;i++){
                sum += i;
            }
        }
        if(N == 0){ sum = 1; }
        System.out.println(sum);
    }
}
