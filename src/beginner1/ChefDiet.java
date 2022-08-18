/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-08-2022
 */

package beginner1;

import java.util.Scanner;

public class ChefDiet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int rem = 0, i=0;
            for (i = 0; i < N; i++) {
                arr[i] += rem;
                if(arr[i]<K) {
                    System.out.println("NO " + (i+1));
                    break;
                }
                rem = arr[i]-K;
            }
            if(i==N)
                System.out.println("YES");
            T--;
        }
    }
}
