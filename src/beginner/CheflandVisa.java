/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 13-11-2022
 */

package beginner;

import java.util.Scanner;

public class CheflandVisa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y1 = sc.nextInt();
            int y2 = sc.nextInt();
            int z1 = sc.nextInt();
            int z2 = sc.nextInt();
            if(x2>=x1 && y2>=y1 && z2<=z1)
                System.out.println("YES");
            else
                System.out.println("NO");
            T--;
        }
    }
}
