/*
The chef has a recipe he wishes to use for his guests, but the recipe will make far more food
than he can serve to the guests. The chef therefore would like to make a reduced version of the recipe
which has the same ratios of ingredients, but makes less food. The chef, however, does not like fractions.
The original recipe contains only whole numbers of ingredients, and the chef wants the reduced recipe
to only contain whole numbers of ingredients as well.
Help the chef determine how much of each ingredient to use in order to make as little food as possible.
*/
package beginner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CuttingRecipies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int N = sc.nextInt();
                int[] arr = new int[N];
                for (int i = 0; i < N; i++) {
                    arr[i] = sc.nextInt();
                }
                int gcd = gcd(arr[0], arr[1]);
                for (int i = 2; i < N; i++) {
                    gcd = gcd(gcd, arr[i]);
                }
                for (int i = 0; i < N; i++) {
                    System.out.print(arr[i]/gcd + " ");
                }
            }
        }
    }
    public static int gcd ( int a, int b){
        int res = 0;
        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
            res = a;
        }
        return res;
    }
}
