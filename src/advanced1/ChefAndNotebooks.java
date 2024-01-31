package advanced1;

import java.util.Scanner;

public class ChefAndNotebooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int[] inputs = new int[4];
            for (int i = 0; i < inputs.length; i++) {
                inputs[i] = sc.nextInt();
            }
            boolean flag = false;
            for (int i = 0; i < inputs[3]; i++) {
                int Pi = sc.nextInt();
                int Ci = sc.nextInt();
                if ((inputs[1] + Pi) >= inputs[0] && Ci <= inputs[2]) {
                    flag = true;
                }
            }
            if (flag)
                System.out.println("LuckyChef");
            else
                System.out.println("UnluckyChef");
            T--;
        }
    }
}
