/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 31-10-2022
 */

package beginner;

import java.util.Scanner;

public class GoodWeather {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int[] arr = new int[7];
            int sunny = 0;
            int rainy = 0;
            for (int i = 0; i < 7; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] == 1)
                    sunny++;
                else
                    rainy++;
            }
            if(sunny>rainy)
                System.out.println("Yes");
            else
                System.out.println("No");
            T--;
        }
    }
}
