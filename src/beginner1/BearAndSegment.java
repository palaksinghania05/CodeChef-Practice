package beginner1;

import java.util.Scanner;

public class BearAndSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int i = 0; i < tc; i++) {
            String s = sc.next();
            int n = s.length();
            int one=0;
            int count=0;

            for(int j=0;j<n;j++){
                if(s.charAt(j)=='1'){
                    one++;
                }
            }
            for(int j=0;j<n;j++){

                if(j<n-1) {
                    if (s.charAt(j) == '1' && s.charAt(j + 1) == '0') {
                        count++;
                        break;
                    } else if (s.charAt(j) == '1') {
                        count++;
                    }
                }
                else if(j==n-1){
                    if(s.charAt(j) == '1'){
                        count++;
                    }
                    else{
                        break;
                    }
                }
            }
           if(one==0){
               System.out.println("NO");
           }
           else if(count==one){
               System.out.println("YES");
           }
           else{
               System.out.println("NO");
           }
        }
    }
}
