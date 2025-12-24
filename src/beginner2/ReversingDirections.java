package beginner2;

import java.util.Scanner;

public class ReversingDirections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            int N = sc.nextInt();
            sc.nextLine();
            String[] A = new String[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLine();
            }
            int index = A[N - 1].indexOf(" ");
            String temp = index != -1 ? A[N - 1].substring(0, index) : A[N - 1];
            String temp2 = index != -1 ? A[N - 1].substring(index + 1) : "";
            System.out.println("Begin " + temp2);

            for (int i = N - 2; i >= 0; i--) {
                String oldDir = temp;
                index = A[i].indexOf(" ");
                temp = index != -1 ? A[i].substring(0, index) : A[i];
                temp2 = index != -1 ? A[i].substring(index + 1) : "";
                String newDir = "";
                if (oldDir.equals("Right")) newDir = "Left";
                else newDir = "Right";
                System.out.println(newDir + " " + temp2);
            }
            System.out.println();
        }
    }
}
