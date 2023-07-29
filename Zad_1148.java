import java.util.Scanner;

public class Zad_1148 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        char c = s.next().charAt(0);
        int ascii = (int) c;

        if(ascii >= 65 && ascii <= 90){
            ascii += 32;
            System.out.println((char) ascii);
            return;
        }
        if(ascii >= 97 && ascii <= 122){
            ascii -= 32;
            System.out.println((char) ascii);
            return;
        }
        System.out.println(c);
    }
}
