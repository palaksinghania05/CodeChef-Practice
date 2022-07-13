/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 13-07-2022
 */

package beginner;

import java.util.Scanner;

public class MyVeryFirstContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int rating = N-A;
        int strictRating = rating-B;
        System.out.println(rating + " " + strictRating);
    }
}
