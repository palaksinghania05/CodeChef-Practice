package datastructures;/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-06-2022
 */

import java.util.Scanner;

public class PracticeMakesUsPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        int result = 0;
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
            if(arr[i]>=10)
                result++;
        }
        System.out.println(result);
    }
}
