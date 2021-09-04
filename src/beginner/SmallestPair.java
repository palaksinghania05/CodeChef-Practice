/*
You are given a sequence a1, a2, ..., aN.
Find the smallest possible value of ai + aj, where 1 ≤ i < j ≤ N.
 */

package beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SmallestPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // while(sc.hasNext()){
            int t = sc.nextInt();
            while(t-->0){
                int N = sc.nextInt();
                int[] arr = new int[N];
                for (int i = 0; i < N; i++) {
                    arr[i] = sc.nextInt();
                }
                int sum = arr[0] + arr[1];
                for (int i = 1; i <= N; i++) {
                    for (int j = i+1; j <= N; j++) {
                        int add = arr[i - 1] + arr[j - 1];
                        if(add < sum)
                            sum = add;
                        else
                            continue;
                    }
                }
                System.out.println(sum);
            }
        }
    }
//}
