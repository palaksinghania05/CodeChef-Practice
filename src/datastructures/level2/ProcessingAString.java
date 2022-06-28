/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 28-06-2022
 */

package datastructures.level2;

import java.util.Scanner;

public class ProcessingAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            String s = sc.next();
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                if(Character.isDigit(s.charAt(i)))
                    sum = sum + (s.charAt(i)-'0');
            }
            System.out.println(sum);
            T--;
        }
    }
}
