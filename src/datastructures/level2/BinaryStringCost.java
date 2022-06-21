/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 21-06-2022
 */

package datastructures.level2;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryStringCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int X = sc.nextInt(); //01
            int Y = sc.nextInt(); //10
            String s = sc.next();
            char[] str = s.toCharArray();
            if(X<Y) {
                int i = N - 1;
                for (int j = N - 1; j >= 0; j--) {
                    if (str[j] != '0') {
                        char c = str[i];
                        str[i] = str[j];
                        str[j] = c;
                        i--;
                    }
                }
                if(str[0]=='0' && str[N-1]=='1')
                    System.out.println(X);
                else
                    System.out.println(0);
            } else {
                int i = N - 1;
                for (int j = N - 1; j >= 0; j--) {
                    if (str[j] != '1') {
                        char c = str[i];
                        str[i] = str[j];
                        str[j] = c;
                        i--;
                    }
                }
                if(str[N-1]=='0' && str[0]=='1')
                    System.out.println(Y);
                else
                    System.out.println(0);
            }
            T--;
        }
    }
}

//swapping is important - keep revising