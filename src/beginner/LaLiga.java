/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 25-12-2022
 */

package beginner;

import java.util.HashMap;
import java.util.Scanner;

public class LaLiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < 4; i++) {
                map.put(sc.next(), sc.nextInt());
            }
            if ((map.get("RealMadrid") < map.get("Malaga")) && (map.get("Barcelona") > map.get("Eibar")))
                System.out.println("Barcelona");
            else
                System.out.println("RealMadrid");
            T--;
        }
    }
}
