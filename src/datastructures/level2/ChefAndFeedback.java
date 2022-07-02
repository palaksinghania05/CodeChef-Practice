/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 02-07-2022
 */

package datastructures.level2;

import java.util.Scanner;

public class ChefAndFeedback {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            String s = sc.next();
            int flag = 0;
            for (int i = 1; i < s.length()-1; i++) {
                if((s.charAt(i-1)=='0' && s.charAt(i)=='1' && s.charAt(i+1)=='0') ||
                        (s.charAt(i-1)=='1' && s.charAt(i)=='0' && s.charAt(i+1)=='1')){
                    flag = 1;
                    break;
                } else{
                    continue;
                }
            }
            if(flag==1)
                System.out.println("Good");
            else
                System.out.println("Bad");
            T--;
        }
    }
}
