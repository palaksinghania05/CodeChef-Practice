/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 20-06-2022
 */

package datastructures.level2;

import java.util.Scanner;

public class SnakeProcession {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        while(R>0){
            int L = sc.nextInt();
            String report = sc.next();
            int headCount = 0;
            int tailCount = 0;
            for (int i = 0; i < L; i++) {
                if(report.charAt(i)=='H')
                    headCount++;
                else if(report.charAt(i)=='T')
                    tailCount++;
            }
            if(headCount != tailCount)
                System.out.println("Invalid");
            else{
                report = report.replace(".","");
                if(report.length()==0)
                    System.out.println("Valid");
                else if(report.charAt(0)=='H'){
                    boolean flag = false;
                    for (int i = 0; i < report.length() - 1; i++) {
                        if(report.charAt(i) == report.charAt(i+1)) {
                            flag = true;
                            break;
                        }
                    }
                    if(flag)
                        System.out.println("Invalid");
                    else
                        System.out.println("Valid");
                }
                else
                    System.out.println("Invalid");
            }
            R--;
        }
    }
}
