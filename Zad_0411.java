import java.util.Scanner;
public class Zad_0411 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        float c = scan.nextFloat();

        if (a == 0 && b == 0){
            System.out.println(-1);
        }
        if (a == 0 && b != 0){
            System.out.println(1);
            System.out.println(-c / b);
        }
        else{
            
        }
    }
}
