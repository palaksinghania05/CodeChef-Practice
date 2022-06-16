/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 16-06-2022
 */

package beginner;

import java.util.Scanner;

public class BlackCells {
    public static void main (String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            System.out.println((N*N)/2);
        }
    }
}
