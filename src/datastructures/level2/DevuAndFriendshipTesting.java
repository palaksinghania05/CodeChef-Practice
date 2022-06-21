/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 21-06-2022
 */

package datastructures.level2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DevuAndFriendshipTesting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            HashMap<Integer, Integer> days = new HashMap<>();
            for (int i = 0; i < N; i++) {
                arr[i]= sc.nextInt();
                if(days.containsKey(arr[i]))
                    continue;
                else
                    days.put(arr[i],1);
            }
            System.out.println(days.size());
            T--;
        }
    }
}
