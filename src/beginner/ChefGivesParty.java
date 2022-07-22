/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 22-07-2022
 */

package beginner;

import java.util.Scanner;

public class ChefGivesParty {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int K = sc.nextInt();
            if((N*X)<=K)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
