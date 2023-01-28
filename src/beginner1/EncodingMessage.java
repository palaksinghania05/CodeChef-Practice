/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 19-08-2022
 */

package beginner1;

import java.util.Scanner;

public class EncodingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            String S = sc.next();
            if(N%2==0)
                S = firstStep(S);
            else
                S = firstStep(S.substring(0,N-1)) + S.charAt(N-1);
            String result = secondStep(S);
            System.out.println(result);
            T--;
        }
    }

    public static String firstStep(String s){
        String out = "";
        for (int i = 0; i < s.length(); i+=2) {
            out+=s.charAt(i+1);
            out+=s.charAt(i);
        }
        return out;
    }

    public static String secondStep(String s){
        for (int i = 0; i < s.length(); i++) {
            s = s.replace("a", "z");
            s = s.replace("b","y");
            s = s.replace("c","x");
            s = s.replace("d","w");
            s = s.replace("e","v");
            s = s.replace("f","u");
            s = s.replace("g","t");
            s = s.replace("h","s");
            s = s.replace("i","r");
            s = s.replace("j","q");
            s = s.replace("k","p");
            s = s.replace("l","o");
            s = s.replace("m","n");
            s = s.replace("n","m");
            s = s.replace("o","l");
            s = s.replace("p","k");
            s = s.replace("q","j");
            s = s.replace("r","i");
            s = s.replace("s","h");
            s = s.replace("t","g");
            s = s.replace("u","f");
            s = s.replace("v","e");
            s = s.replace("w","d");
            s = s.replace("x","c");
            s = s.replace("y","b");
            s = s.replace("z","a");
        }
        return s;
    }
}
