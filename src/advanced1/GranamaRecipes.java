package advanced1;

import java.util.HashMap;
import java.util.Scanner;

public class GranamaRecipes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            String R = sc.next();
            String S = sc.next();
            R = R.toLowerCase();
            S = S.toLowerCase();
            char[] charArr1 = R.toCharArray();
            char[] charArr2 = S.toCharArray();
            int temp1 = 0, temp2 = 0;
            HashMap<Character, Integer> hm1 = new HashMap<>();
            for (char value : charArr1)
                hm1.put(value, hm1.getOrDefault(value, 0) + 1);
            HashMap<Character, Integer> hm2 = new HashMap<>();
            for (char value : charArr2)
                hm2.put(value, hm2.getOrDefault(value, 0) + 1);
            if (hm1.keySet().equals(hm2.keySet()))
                temp1 = 1;
            if (hm1.equals(hm2))
                temp2 = 1;
            System.out.println(temp1 == temp2 ? "YES" : "NO");
            T--;
        }
    }
}
