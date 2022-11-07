/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 07-11-2022
 */

package beginner;

import java.util.Scanner;

public class GoodQualityBulbs {
    public static void main(String[] args) {
        int T;
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            int X = sc.nextInt();
            int arr[] = new int[N-1];
            int sum=0;
            for(int j=0;j<(N-1);j++){
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            int y=0;
            int avg=sum/N;
            while(avg<X){
                y++;
                avg = (sum+y)/N;
            }
            System.out.println(y);
            T--;
        }
    }
}
