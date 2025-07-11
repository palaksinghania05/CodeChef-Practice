package beginner2;

import java.util.Arrays;
import java.util.Scanner;

public class HotelBytelandia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt(), result = 0, temp = 0;
            int[] arr = new int[N];
            int[] brr = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                brr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            Arrays.sort(brr);
            for (int i = 0; i < N; i++) {
                if (arr[i] < brr[temp])
                    result++;
                else
                    temp++;
            }
            System.out.println(result);
        }
    }
}
