//Encrypt word: ROADTOSDET [when A=F]
//Output: WTFIYTXIJY
import java.util.Scanner;
public class encrypt_word {
    public static void main(String[] args) {
        System.out.println("Input Word");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char [] chars = word.toCharArray();
        for(char c : chars){
            c+=5;
            System.out.print(c);
        }
    }
}


