/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 27-09-2022
 */

package beginner;

import java.util.Scanner;

public class FindingShoes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            if(M==0)
                System.out.println(N*2);
            else if(N>M)
                System.out.println(N+(N-M));
            else
                System.out.println(N);
            T--;
        }
    }
}
