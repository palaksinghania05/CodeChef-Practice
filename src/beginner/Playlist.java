/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 07-09-2022
 */

package beginner;

import java.util.Scanner;

public class Playlist {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int testCases = scanner.nextInt();

            for (int i=1;i<=testCases;i++){
                int journeyDuration = scanner.nextInt();
                int DurationOfOneSong = scanner.nextInt();

                System.out.println(journeyDuration/(3*DurationOfOneSong));
            }

    }
}
