import java.util.Scanner;

public class Zad_1146 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        char c = s.next().charAt(0);

        if(Character.isDigit(c)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
