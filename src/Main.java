import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        String wantedString = "kerem";
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the first word");
        String str1 =sc.nextLine();
        System.out.println("Please enter the second word");
        String str2 =sc.nextLine();
        System.out.println("Please enter the thırd word");
        String str3 =sc.nextLine();
        System.out.println("Please enter the fourth word");
        String str4 =sc.nextLine();
        System.out.println("Please enter the fifth word");
        String str5 =sc.nextLine();
        String [] wordPool = new String[5];
        wordPool[0]=str1;
        wordPool[1]=str2;
        wordPool[2]=str3;
        wordPool[3]=str4;
        wordPool[4]=str5;
        for(int i=0;i< wordPool.length;i++){
            if(Objects.equals(wordPool[i], wantedString)){
                System.out.println("Tanımlı value yu içeren String deger:" + wordPool[i]);
            }
        }
    }
}

