import java.util.Scanner;

public class Zad_0297 {
    public static void main(String[] args){
        int[] nul = {1, 0, 0, 0, 0, 0, 1, 0, 2, 1};
        Scanner s = new Scanner(System.in);
        char[] n = s.next().toCharArray();
        int count = 0;
        for(int i = 0;i < n.length;i++){
            count += nul[Character.getNumericValue(n[i])];
        }
        System.out.println(count);
    }
}
