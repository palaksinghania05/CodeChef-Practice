package advanced1;

import java.util.Scanner;

public class WeaponValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int[] arr = new int[10];
            String s = sc.nextLine();
            String[] str = new String[N];
            for (int i = 0; i < N; i++) {
                str[i] = sc.nextLine();
            }
            for (int i = 0; i < N; i++) {
                String s1 = str[i];
                for (int j = 0; j < 10; j++) {
                    int tempVar1 = Character.getNumericValue(s1.charAt(j));
                    int tempVar2 = arr[j];
                    int tempVar3 = tempVar1 ^ tempVar2;
                    arr[j] = tempVar3;
                }
            }
            int count = 0;
            for (int i = 0; i < 10; i++) {
                if (arr[i] == 1)
                    count++;
            }
            System.out.println(count);
            T--;
        }
    }
}
