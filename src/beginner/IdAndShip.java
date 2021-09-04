package beginner;

import java.util.Scanner;

public class IdAndShip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                char letter = sc.next().charAt(0);
                if (letter == 'b' || letter == 'B')
                    System.out.println("BattleShip");
                else if (letter == 'c' || letter == 'C')
                    System.out.println("Cruiser");
                else if (letter == 'd' || letter == 'D')
                    System.out.println("Destroyer");
                else
                    System.out.println("Frigate");
            }
        }
    }
}
