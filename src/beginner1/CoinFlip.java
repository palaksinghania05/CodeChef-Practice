package beginner1;

import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int G = sc.nextInt();
            for (int i = 0; i < G; i++) {
                int I = sc.nextInt();
                int N = sc.nextInt();
                int Q = sc.nextInt();
                int head = 0, tail = 0;
                if (N % 2 == 0) {
                    head = N / 2;
                    tail = N / 2;
                } else {
                    if (I == 1) {
                        head = N / 2;
                        tail = N / 2 + 1;
                    } else {
                        head = N / 2 + 1;
                        tail = N / 2;
                    }
                }
                if (Q == 1) {
                    System.out.println(head);
                } else {
                    System.out.println(tail);
                }
            }
            T--;
        }
        /*
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T>0){
            int G = sc.nextInt();
            for (int i = 0; i < G; i++) {
                int I = sc.nextInt();
                int N = sc.nextInt();
                int Q = sc.nextInt();
                StringBuilder coins = new StringBuilder();
                if(I==1)
                    for (int j = 0; j < N; j++) {
                        coins.append('H');
                    }
                else {
                    for (int j = 0; j < N; j++) {
                        coins.append('T');
                    }
                }
                for (int j = 0; j < N; j++) {
                    for (int k = 0; k <= j; k++) {
                        reverse(coins, k, coins.charAt(k));
                    }
                    System.out.println(coins);
                }
                int heads = countH(coins);
                int tails = countT(coins);
                if(Q==1)
                    System.out.println(heads);
                else
                    System.out.println(tails);
            }
            T--;
        }
    }

    public static void reverse(StringBuilder s, int i, char c){
        if(c =='H') {
           s.replace(i,i+1, "T");
        } else
            s.replace(i,i+1, "H");
    }

    public static int countH(StringBuilder s){
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='H')
                result++;
        }
        return result;
    }

    public static int countT(StringBuilder s){
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='T')
                result++;
        }
        return result;
        */
    }
}
