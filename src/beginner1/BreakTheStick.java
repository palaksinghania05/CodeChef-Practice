/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 15-01-2023
 */

package beginner1;

import java.util.Scanner;

public class BreakTheStick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            if (N % 2 == 0)
                System.out.println("YES");
            else {
                if (X % 2 == 0)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
            T--;
        }
    }
}


/*
The first thing that we have to note is that we initially can break the stick in whatever length we wish.
Since X < N, we can directly break the stick to the target length, i.e. to X. From there on, we can make multiple observations:
1. If the initial length (N) of the stick was even and the target length (X) is also even, we are left with
two sticks of even length, namely X and N-X. Since the two sticks have the same parity, we can stop breaking
the sticks further down.

2. If the initial length (N) of the stick was even and the target length (X) is odd, we are left with two
 sticks of odd length, namely X and N-X. Since the two sticks have the same parity, we can stop breaking
 the sticks further down.

3. If the initial length (N) of the stick was odd and the target length (X) is also odd, we are left with
one stick of odd length (X) and one stick of even length (X-N). Since X-N is even, this means that we can
keep breaking X-N in two (this is equivalent with dividing by two) until we get all sticks of length 1, thus
achieving the same parity (= odd) for every stick.

4. If the initial length (N) of the stick was odd and the target length (X) is even, we are left with one
stick of even length (X) and one stick of odd length (X-N). Since X-N cannot be further broken down in a way
that every stick will have an even parity (same parity as X), we conclude that Chef cannot obtain a stick of
length X given the constraint of parity.

 */