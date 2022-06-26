/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 27-06-2022
 */

package datastructures.level2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudyingAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            chars.add(s.charAt(i));
        }
        int N = sc.nextInt();
        String[] words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = sc.next();
            boolean flag = false;
            for (int j = 0; j < words[i].length(); j++) {
                if(chars.contains(words[i].charAt(j)))
                    continue;
                else{
                    flag = true;
                    break;
                }
            }
            if(flag)
                System.out.println("No");
            else
                System.out.println("Yes");
        }
    }
}
