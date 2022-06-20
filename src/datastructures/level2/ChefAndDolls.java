/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 20-06-2022
 */

package datastructures.level2;

import java.util.HashMap;
import java.util.Scanner;

public class ChefAndDolls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            HashMap<Integer, Integer> dolls = new HashMap<>();
            for (int i = 0; i < N; i++) {
                if(!dolls.containsKey(arr[i])){
                    dolls.put(arr[i],1);
                } else {
                    dolls.put(arr[i], dolls.get(arr[i])+1);
                }
            }
            for (Integer key : dolls.keySet()) {
                if (dolls.get(key) % 2 != 0)
                    System.out.println(key);
            }
            T--;
        }
    }
}

