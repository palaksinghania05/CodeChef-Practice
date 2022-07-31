/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 31-07-2022
 */

package beginner;

import java.util.Scanner;

public class RatingImprovement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(Y>=X && Y<=X+200)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
