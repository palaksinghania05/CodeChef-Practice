package beginner;

import java.util.Scanner;

public class EnormousInputTest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(sc.hasNextInt()){
            long n = sc.nextLong();
            long k = sc.nextLong();
            int count = 0;
            for(int i = 0 ; i<n ; i++){
                long t = sc.nextLong();
                if(t%k==0)
                    count = count + 1;
            }
            System.out.println(count);
        }
    }
}
