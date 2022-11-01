/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 01-11-2022
 */

package beginner;

import java.util.Scanner;

public class CircularTrack {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            int M = sc.nextInt();
            int C = Math.abs(A-B);
            if(C<=M/2){
                System.out.println(C);

            }else{
                System.out.println(M-C);
            }
            T--;
        }
    }
}
