/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-10-2022
 */

package beginner;

import java.util.Scanner;

public class CountTheAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int P = sc.nextInt();
            if(P%100==0)
                System.out.println(P/100);
            else{
                if(P-(P/100)*100 <= 10)
                    System.out.println((P/100) + (P-(P/100)*100));
                else
                    System.out.println(-1);
            }
            T--;
        }
    }
}
