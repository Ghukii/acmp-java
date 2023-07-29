import java.util.Scanner;

public class Zad_0003 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int new_n = n / 10;
        if (n == 5){
            System.out.println(25);
        }
        else {
            System.out.println(Integer.toString(new_n * (new_n + 1)) + "25");
        }
    }
}
