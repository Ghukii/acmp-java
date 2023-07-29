import java.util.Scanner;

public class Zad_1149 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        char line[]= a.toCharArray();
        int count = 0;

        for(int i = 0;i<a.length();i++){
            if(line[i] == '0'){
                count++;
            }
        }
        System.out.println(count);
    }
}
