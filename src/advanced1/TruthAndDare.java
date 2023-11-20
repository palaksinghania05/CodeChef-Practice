package advanced1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruthAndDare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int Tr = sc.nextInt();
            List<Integer> truthRamArray = new ArrayList<>();
            for (int i = 0; i < Tr; i++) {
                truthRamArray.add(sc.nextInt());
            }
            int Dr = sc.nextInt();
            List<Integer> dareRamArray = new ArrayList<>();
            for (int i = 0; i < Dr; i++) {
                dareRamArray.add(sc.nextInt());
            }
            int Ts = sc.nextInt();
            List<Integer> truthShyamArray = new ArrayList<>();
            for (int i = 0; i < Ts; i++) {
                truthShyamArray.add(sc.nextInt());
            }
            int Ds = sc.nextInt();
            List<Integer> dareShyamArray = new ArrayList<>();
            for (int i = 0; i < Ds; i++) {
                dareShyamArray.add(sc.nextInt());
            }
            boolean flag1 = true, flag2 = true;
            for (int find : truthShyamArray) {
                if (!truthRamArray.contains(find)) {
                    flag1 = false;
                    break;
                }
            }
            for (int find : dareShyamArray) {
                if (!dareRamArray.contains(find)) {
                    flag2 = false;
                    break;
                }
            }
            if (flag1 && flag2)
                System.out.println("yes");
            else
                System.out.println("no");
            T--;
        }
    }
}
