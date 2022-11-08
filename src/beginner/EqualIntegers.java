/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 08-11-2022
 */

package beginner;

import java.util.Scanner;

public class EqualIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int min = Math.min(X,Y);
            int max = Math.max(X,Y);
            if(min==X){
                System.out.println(Y-X);
            }
            else if((Y-X)%2==0){
                System.out.println((X-Y)/2);
            }
            else{
                System.out.println(((X-Y)/2)+2);
            }
            T--;
        }
    }
}
