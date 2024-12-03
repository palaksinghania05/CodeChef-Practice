package advanced1;

import java.util.HashMap;
import java.util.Scanner;

public class SubsequenceEquality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            String S = sc.nextLine();
            HashMap<Character, Integer> map = new HashMap<>();
            for (char ele : S.toCharArray()) {
                map.put(ele, map.getOrDefault(ele, 0) + 1);
            }
            int count = 0;
            for (int freq : map.values()) {
                if (freq > 1) {
                    count++;
                }
            }
            if (count < 1) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
            T--;
        }
    }
}
