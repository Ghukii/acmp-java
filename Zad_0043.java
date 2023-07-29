import java.util.Scanner;

public class Zad_0043 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        char[] str = s.next().toCharArray();
        int max_nuls = 0;
        int count = 0;

        for(int i=0;i<str.length - 1;i++){
            if(str[i] == '0' && str[i+1] == '0'){
                count++;
            }
            if(str[i] == '0' && str[i + 1] == '1') {
                count++;
                if(max_nuls < count){
                    max_nuls = count;
                }
                count = 0;
            }
            if(i == str.length - 2 && str[i] == '0' && str[i + 1] == '0'){
                count++;
                if(max_nuls < count){
                    max_nuls = count;
                }
                count = 0;
            }
        }
        System.out.println(max_nuls);

    }
}
