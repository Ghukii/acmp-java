import java.util.Scanner;

public class Zad_1152 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char[] c = s.nextLine().toCharArray();
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]);
            if(i == c.length - 1){
                break;
            }
            System.out.print("#");
        }
    }
}
