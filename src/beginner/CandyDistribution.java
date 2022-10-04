/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 03-10-2022
 */

package beginner;

import java.util.Scanner;

public class CandyDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            if(N%M != 0){
                System.out.println("No");
            } else {
                if((N/M) % 2 == 0)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
            T--;
        }
    }
}
