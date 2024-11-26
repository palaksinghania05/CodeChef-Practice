package advanced1;

import java.util.HashMap;
import java.util.Scanner;

public class InternetMediaTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String key = sc.next();
            String value = sc.next();
            map.put(key, value);
        }
        for (int i = 0; i < Q; i++) {
            String s = sc.next();
            if (!s.contains(".")) {
                System.out.println("unknown");
            } else {
                int temp = -1;
                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt(k) == '.') {
                        temp = k;
                    }
                }
                String result = s.substring(temp + 1);
                System.out.println(map.getOrDefault(result, "unknown"));
            }
        }
    }
}
