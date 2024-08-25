package advanced1;

import java.util.Scanner;

public class VillagesAndTribes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int[] arr = new int[2];
            int count = 0;
            char result = '.';
            String S = sc.next();
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == '.') {
                    count++;
                } else {
                    char temp = S.charAt(i);
                    int idx = temp == 'A' ? 0 : 1;
                    arr[idx] += 1;
                    boolean isSameTribe = temp == result;
                    if (isSameTribe)
                        arr[idx] += count;
                    count = 0;
                    result = temp;
                }
            }
            System.out.println(arr[0] + " " + arr[1]);
            T--;
        }
    }
}
