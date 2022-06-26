/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 25-06-2022
 */

package datastructures.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class DescrepenciesInVoterList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();
        int[] arr1 = new int[N1];
        int[] arr2 = new int[N2];
        int[] arr3 = new int[N3];
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < N1; i++) {
            arr1[i] = sc.nextInt();
            if(!freq.containsKey(arr1[i]))
                freq.put(arr1[i],1);
            else
                freq.put(arr1[i], freq.get(arr1[i])+1);

        }
        for (int i = 0; i < N2; i++) {
            arr2[i] = sc.nextInt();
            if(!freq.containsKey(arr2[i]))
                freq.put(arr2[i],1);
            else
                freq.put(arr2[i], freq.get(arr2[i])+1);
        }
        for (int i = 0; i < N3; i++) {
            arr3[i] = sc.nextInt();
            if(!freq.containsKey(arr3[i]))
                freq.put(arr3[i],1);
            else
                freq.put(arr3[i], freq.get(arr3[i])+1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer key : freq.keySet()) {
            if(freq.get(key)>=2)
                result.add(key);
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
