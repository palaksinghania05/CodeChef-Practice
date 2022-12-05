/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 03-12-2022
 */

package beginner;

import java.util.ArrayList;
import java.util.Scanner;

public class ChefAndSnackdown {
    public static void main(String[] args) {
        ArrayList<Integer> year = new ArrayList<>();
        year.add(2010);
        year.add(2015);
        year.add(2016);
        year.add(2017);
        year.add(2019);
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            if (year.contains(N))
                System.out.println("HOSTED");
            else
                System.out.println("NOT HOSTED");
            T--;
        }
    }
}
