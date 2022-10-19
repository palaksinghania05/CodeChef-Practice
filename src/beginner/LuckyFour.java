/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 19-10-2022
 */

package beginner;

import java.util.Scanner;

public class LuckyFour {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        for(int i=0;i<t;i++){
            String s = sc.next();
            int count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(j)=='4'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
