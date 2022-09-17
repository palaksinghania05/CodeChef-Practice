/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 17-09-2022
 */

package beginner;

import java.util.Scanner;

public class SugarcaneJuiceBusiness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int N = sc.nextInt();
            int coins = N*50;
            int sugarcane = (20*coins)/100;
            int saltAndLeaves = (20*coins)/100;
            int rent = (30*coins)/100;
            System.out.println(coins-(sugarcane+saltAndLeaves+rent));
            T--;
        }
    }
}
