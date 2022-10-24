/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 24-10-2022
 */

package beginner;

import java.util.Scanner;

public class TheCoolerDilemma2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int i = 0;
            while(true){
                if(Y<=X*i)
                    break;
                else
                    i++;
            }
            System.out.println(i-1);
            T--;
        }
    }
}
