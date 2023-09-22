package beginner1;

import java.util.Scanner;

public class ChefAndHisStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte T = sc.nextByte();
        while (T > 0) {
            String s = sc.next();
            int count = 0;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == '<' && s.charAt(i + 1) == '>') {
                    count++;
                }
            }
            System.out.println(count);
            T--;
        }
    }
}
