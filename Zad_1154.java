import java.util.Scanner;

public class Zad_1154 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String ip = s.nextLine();

        String[] numbers = ip.split("\\.");

        boolean Flag = true;
        for(String num : numbers){
            if(!(Integer.parseInt(num) < 256 && Integer.parseInt(num) > 0)) {
                Flag = false;
                break;
            }
        }
        if(!Flag){
            System.out.println("Bad");
        }
        else{
            System.out.println("Good");
        }
    }
}
