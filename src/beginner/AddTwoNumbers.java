package beginner;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int t = sc.nextInt();
            while(t>0){
                long a = sc.nextLong();
                long b = sc.nextLong();
                System.out.println(a+b);
                t--;
            }
        }
    }
}
