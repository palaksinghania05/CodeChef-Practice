/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 22-10-2022
 */

package beginner;

import java.util.Scanner;

public class LifeUniverseEverything {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int i = sc.nextInt();
            if(i==42)
                break;
            else
                System.out.println(i);
        }
    }
}
