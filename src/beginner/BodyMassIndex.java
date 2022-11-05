/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 05-11-2022
 */

package beginner;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T =sc.nextInt();
        while (T>0){
            int M = sc.nextInt();
            int H = sc.nextInt();
            int BMI = (int) (M/(Math.pow(H,2)));
            if(BMI<=18)
                System.out.println(1);
            else if(BMI>=19 && BMI<=24)
                System.out.println(2);
            else if(BMI>=25 && BMI<=29)
                System.out.println(3);
            else
                System.out.println(4);
            T--;
        }
    }
}
