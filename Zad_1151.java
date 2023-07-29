import java.util.Scanner;

public class Zad_1151 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char[] pass = s.next().toCharArray();

        int upper = 0, lower = 0, num = 0;
        if(pass.length >= 12){
            for(int i = 0;i<pass.length;i++){
                if(Character.isUpperCase(pass[i])){
                    upper++;
                }
                if(Character.isLowerCase(pass[i])){
                    lower++;
                }
                if(Character.isDigit(pass[i])){
                    num++;
                }
            }
            if (lower > 0 && upper > 0 && num > 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        else{
            System.out.println("No");
        }
    }
}
