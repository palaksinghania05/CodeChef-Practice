/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 28-10-2022
 */

package beginner;

import java.util.Scanner;

public class EqualizingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A==B){
                System.out.println("YES");
            }else if(Math.abs(A-B)%2==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            T--;
        }
    }
}
