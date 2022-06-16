/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 16-06-2022
 */

package datastructures;

import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            String S = sc.next();
            String X = sc.next();
            StringBuilder M = new StringBuilder();
            for (int i = 0; i < 5; i++) {
                if(S.charAt(i) == X.charAt(i))
                    M.append('G');
                else
                    M.append('B');
            }
            System.out.println(M);
            T--;
        }
    }
}
