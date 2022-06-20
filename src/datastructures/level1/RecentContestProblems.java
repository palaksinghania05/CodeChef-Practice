/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 16-06-2022
 */

package datastructures.level1;

import java.util.Scanner;

public class RecentContestProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            String[] arr = new String[N];
            int starter = 0;
            int lunchtime = 0;
            for (int i = 0; i < N; i++) {
                arr[i] = sc.next();
                if(arr[i].equals("START38"))
                    starter++;
                else
                    lunchtime++;
            }
            System.out.println(starter + " " + lunchtime);
            T--;
        }
    }
}
