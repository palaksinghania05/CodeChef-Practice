package beginner1;

import java.util.Scanner;

public class MovieWeekend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int L[] = new int[n];
            int R[] = new int[n];
            for (int i = 0; i < n; i++) {
                L[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                R[i] = sc.nextInt();
            }
            int max = 0, product = 0, movie = 0;
            for (int i = 0; i < n; i++) {
                product = L[i] * R[i];
                if (product > max) {
                    max = product;
                    movie = i;
                } else if (product == max) {
                    if ((max / L[movie]) < (product / L[i])) {
                        movie = i;
                        max = product;
                    } else if ((max / L[movie]) == (product / L[i])) {
                        if (movie > i) {
                            movie = i;
                        }
                    }
                }
            }
            System.out.println(movie + 1);
            T--;
        }
    }
}
