/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-06-2022
 */

package datastructures.level1;

import java.util.Scanner;

public class PlayingWithMatches {
    public static void main(String[] args) {
        int[] numberOfMatches = {6,2,5,5,4,5,6,3,7,6};
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            long A = sc.nextLong();
            long B = sc.nextLong();
            long sum = A+B;
            int result = 0;
            while(sum!=0){
                int digit = (int) (sum % 10);
                result = result + numberOfMatches[digit];
                sum = sum/10;
            }
            System.out.println(result);
            T--;
        }
    }
}
