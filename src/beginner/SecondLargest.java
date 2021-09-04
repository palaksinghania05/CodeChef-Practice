package beginner;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t > 0) {
                int[] arr = new int[3];
                for (int i = 0; i < 3; i++) {
                    arr[i] = sc.nextInt();
                }
                Arrays.sort(arr);
                System.out.println(arr[1]);
                t--;
            }
        }
    }
}
