/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 08-08-2022
 */

package beginner;

import java.util.Scanner;

public class CountingPrettyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int L = sc.nextInt();
            int R = sc.nextInt();
            int count = 0;
            for (int i = L; i <= R; i++) {
                int lastDigit = i%10;
                if(lastDigit == 2 || lastDigit == 3 || lastDigit == 9)
                    count++;
            }
            System.out.println(count);
            T--;
        }
    }
}
