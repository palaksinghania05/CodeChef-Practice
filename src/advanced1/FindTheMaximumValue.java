package advanced1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FindTheMaximumValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T-- > 0) {
            String N = sc.nextLine();
            String[] arr = N.split(" ");
            ArrayList<Integer> list = new ArrayList<>();
            for (String obj : arr)
                list.add(Integer.parseInt(obj));
            int temp = list.size() - 1;
            list.sort(Collections.reverseOrder());
            if (list.get(0) == temp)
                System.out.println(list.get(1));
            else
                System.out.println(list.get(0));
        }
    }
}
