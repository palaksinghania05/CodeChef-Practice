/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-06-2022
 */

package datastructures;

import java.util.ArrayList;
import java.util.Scanner;

public class TheLeadGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int lead = 0;
        int leader = 0;
        int player1 = 0;
        int player2 = 0;
        while(T!=0){
            player1 = player1 + sc.nextInt();
            player2 = player2 + sc.nextInt();
            if(Math.abs(player1-player2)>lead) {
                lead = Math.abs(player1 - player2);
                leader = player1>player2 ? 1 : 2;
            }
            T--;
        }
        System.out.println(leader + " " + lead);
    }
}
