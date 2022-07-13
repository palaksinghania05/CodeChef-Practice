/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 13-07-2022
 */

package beginner;

import java.util.Scanner;

public class RollerCoaster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int H = sc.nextInt();
            if(X>=H)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
