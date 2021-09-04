package beginner;

import java.util.Scanner;

public class GCDAndLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int t =sc.nextInt();
            while(t>0){
                long a = sc.nextLong();
                long b = sc.nextLong();
                long max;
                long min;
                if(a>b){
                    max=a;
                    min=b;
                }
                else{
                    max = b;
                    min = a;
                }
                while(min>0){
                    long temp=min;
                    min=max%min;
                    max=temp;
                }
                System.out.println(max + " " + a*b/max);
                t--;
            }
        }
    }
}
