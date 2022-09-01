/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 01-09-2022
 */

package beginner;

import java.util.Scanner;

public class CourseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            if(N<=(M-K))
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
