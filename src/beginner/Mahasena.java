package beginner;

import java.util.Scanner;

public class Mahasena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0 ; i< N; i++){
                arr[i] = sc.nextInt();
            }
            int even = 0;
            int odd = 0;
            for(int i = 0; i< N; i++){
                if(arr[i] %2 == 0)
                    even++;
                else
                    odd++;
            }
            if(even<=odd)
                System.out.println("NOT READY");
            else
                System.out.println("READY FOR BATTLE");
        }
    }
}
