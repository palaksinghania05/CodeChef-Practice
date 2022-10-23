/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 23-10-2022
 */

package beginner;

import java.util.Scanner;

public class DegreeOfPolynomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            int result =0;
            for(int i=0; i<N ;i++)
            {
                arr[i] = sc.nextInt();
            }
            for(int i=0;i<N;i++)
            {
                if(arr[i]!=0)
                {
                    result=i;
                }
            }
            System.out.println(result);
            T--;
        }
    }
}
