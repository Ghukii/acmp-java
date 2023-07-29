import java.util.Scanner;

public class Zad_1153 {

    public static int letter(char a){ // 1 - гласная, 0 - согласная
        if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'y'){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char[] str = s.next().toCharArray();
        int count = 0;
        for(int i = 0; i<str.length - 2; i++){
            if((letter(str[i]) == 1 && letter(str[i + 1]) == 1 && letter(str[i + 2]) == 1) ||
            (letter(str[i]) == 0 && letter(str[i + 1]) == 0 && letter(str[i + 2]) == 0)){
                count++;
                i += 2;
            }
        }
        System.out.println(count);
    }
}
