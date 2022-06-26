/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 27-06-2022
 */

package datastructures.level2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestingRobot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            String s = sc.next();
            Set<Integer> points = new HashSet<>();
            points.add(X);
            for (int i = 0; i < N; i++) {
                if(s.charAt(i)=='L') {
                    X--;
                    points.add(X);
                }
                else {
                    X++;
                    points.add(X);
                }
            }
            System.out.println(points.size());
            T--;
        }
    }
}
