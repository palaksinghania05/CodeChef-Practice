/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 05-12-2022
 */

package beginner;

import java.util.ArrayList;
import java.util.Scanner;

public class CountTheHolidays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            ArrayList<Integer> days = new ArrayList<>();
            for (int i = 1; i <= 30; i++) {
                if (i % 7 == 0) {
                    days.add(i);
                    days.add(i - 1);
                }
            }
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (!days.contains(arr[i]))
                    days.add(arr[i]);
            }
            System.out.println(days.size());
            T--;
        }
    }
}
