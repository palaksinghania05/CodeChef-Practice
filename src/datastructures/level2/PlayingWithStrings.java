/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 25-06-2022
 */

package datastructures.level2;

import java.util.Scanner;

public class PlayingWithStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            String S = sc.next();
            String R = sc.next();
            int Sones = 0;
            int Szeroes = 0;
            for (int i = 0; i < N; i++) {
                if(S.charAt(i)=='0')
                    Szeroes++;
                else
                    Sones++;
            }
            int Rones = 0;
            int Rzeroes = 0;
            for (int i = 0; i < N; i++) {
                if(R.charAt(i)=='0')
                    Rzeroes++;
                else
                    Rones++;
            }
            if(Szeroes==Rzeroes && Sones==Rones)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
