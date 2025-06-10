package advanced1;

import java.util.Scanner;

public class ChefAndHisApartmentDues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < arr.length; i++)
                arr[i] = sc.nextInt();
            int result = 0;
            for (int i : arr) {
                if (i == 0) {
                    result += 1100;
                } else {
                    if (result - 1000 != 0 && result > 0)
                        result += 100;

                }
            }
            System.out.println(result);
        }
    }
}
