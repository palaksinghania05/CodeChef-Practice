/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 01-07-2022
 */

package datastructures.level2;

import java.util.Scanner;

public class Lapindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            String s = sc.next();
            int n = s.length();
            String partA = s.substring(0,n/2);
            String partB = new String();
            if(n%2==0){
                partB = s.substring(n/2,n);
            } else{
                partB = s.substring(n/2+1,n);
            }

            T--;
        }
    }
}
