/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 17-11-2022
 */

package beginner;

import java.util.Scanner;

public class ProblemCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int x = sc.nextInt();
            if(x>=1 && x<100)
                System.out.println("Easy");
            else if(x>=100 && x<200)
                System.out.println("Medium");
            else
                System.out.println("Hard");
            T--;
        }
    }
}
