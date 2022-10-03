/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 02-10-2022
 */

package beginner;

import java.util.Scanner;

public class ComplementaryStrandInDNA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            String S = sc.next();
            StringBuilder result = new StringBuilder(N);
            for (int i = 0; i < N; i++) {
                if(S.charAt(i) == 'A')
                    result.append('T');
                else if(S.charAt(i) == 'T')
                    result.append('A');
                else if(S.charAt(i) == 'C')
                    result.append('G');
                else
                    result.append('C');
            }
            System.out.println(result);
            T--;
        }
    }
}
