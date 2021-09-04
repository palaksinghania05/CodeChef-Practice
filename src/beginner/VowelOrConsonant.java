package beginner;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int c = sc.next().charAt(0);
            if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                System.out.println("Vowel");
            else
                System.out.println("Consonant");
        }
    }
}
