/*
A permutation of the integers 1 to n is an ordering of these integers. So the natural way to represent a
permutation is to list the integers in this order. With n = 5, a permutation might look like 2, 3, 4, 5, 1.
However, there is another possibility of representing a permutation: You create a list of numbers where the
i-th number is the position of the integer i in the permutation. Let us call this second possibility an
inverse permutation. The inverse permutation for the sequence above is 5, 1, 2, 3, 4.

An ambiguous permutation is a permutation which cannot be distinguished from its inverse permutation.
The permutation 1, 4, 3, 2 for example is ambiguous, because its inverse permutation is the same.
You have to write a program which detects if a given permutation is ambiguous or not.
 */

package beginner;

import java.util.Arrays;
import java.util.Scanner;

public class AmbiguousPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int T = sc.nextInt();
            if (T == 0) {
                break;
            }
            int[] A = new int[T];
            for (int i = 0; i < T; i++) {
                int ele = sc.nextInt();
                A[i] = ele;
            }
            int[] b = new int[T];
            for (int i = 0; i < T; i++) {
                b[A[i] - 1] = i + 1;
            }
            if (Arrays.equals(A, b)) {
                System.out.println("ambiguous");
            } else {
                System.out.println("not ambiguous");
            }
        }
    }
}
