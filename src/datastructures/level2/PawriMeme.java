/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 04-07-2022
 */

package datastructures.level2;

import java.util.Scanner;

public class PawriMeme {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            String s = sc.next();
            String result = s.replaceAll("party","pawri");
            System.out.println(result);
            T--;
        }
    }
}
