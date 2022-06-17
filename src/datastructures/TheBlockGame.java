/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 17-06-2022
 */

package datastructures;

import java.util.Scanner;

public class TheBlockGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            if(N == rev(N))
                System.out.println("wins");
            else
                System.out.println("loses");
            T--;
        }
    }

    public static int rev(int N){
        int reverseN = 0;
        while(N!=0){
            int rem = N % 10;
            reverseN = reverseN * 10 + rem;
            N = N / 10;
        }
        return reverseN;
    }
}
