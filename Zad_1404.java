import java.util.Scanner;

public class Zad_1404 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char[] str = s.nextLine().toCharArray();
        for(int i=0;i<str.length;i++) {
            int index = (int) str[i];
            if (index == 122) {
                index = 97;
            } else {
                index++;
            }
            str[i] = (char) index;
            System.out.print(str[i]);
        }
    }
}
