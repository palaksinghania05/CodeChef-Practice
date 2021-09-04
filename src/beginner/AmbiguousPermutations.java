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

import java.util.ArrayList;
import java.util.Scanner;

public class AmbiguousPermutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            if (N != 0) {
                ArrayList<Integer> arr = new ArrayList<>();
                for (int i = 0; i < N; i++) {
                    arr.add(sc.nextInt());
                }
                System.out.println(arr);
                ArrayList<Integer> inverse = new ArrayList<>();
                for (int i = 0; i < N; i++) {
                    inverse.add(arr.indexOf(i + 1) + 1);
                }
                System.out.println(inverse);
                if (arr.equals(inverse))
                    System.out.println("ambiguous");
                else
                    System.out.println("not ambiguous");
            }
        }
    }
}
