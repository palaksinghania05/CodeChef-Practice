/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-09-2022
 */

package beginner;

import java.util.Scanner;

public class CountTheNotebooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            System.out.println(N*10);
            T--;
        }
    }
}
