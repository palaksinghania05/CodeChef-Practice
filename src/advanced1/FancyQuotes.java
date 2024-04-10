package advanced1;

import java.util.Scanner;

public class FancyQuotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        while (T > 0) {
            String[] S = sc.nextLine().split(" ");
            boolean flag = false;
            for (String ele : S) {
                if (ele.equals("not")) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("Real Fancy");
            } else {
                System.out.println("regularly fancy");
            }
            T--;
        }
    }
}
