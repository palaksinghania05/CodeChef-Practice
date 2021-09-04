package beginner;

import java.util.Scanner;

public class TwoVsTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();
            while(t-->0){
                int x = sc.nextInt();
                int count=0;
                if(x%10==0)
                    System.out.println(0);
                else if(x%5==0){
                    while(x%10!=0){
                        x*=2;
                        count++;
                    }
                    System.out.println(count);
                }
                else
                    System.out.println(-1);
            }
        }
    }
}
