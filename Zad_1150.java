import java.util.Scanner;

public class Zad_1150 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char[] c = s.nextLine().toCharArray();
        for(int i = 0;i<c.length; i++){
            if(c[i] != '4' && c[i] != '7'){
                System.out.print(c[i]);
            }
        }
    }
}
