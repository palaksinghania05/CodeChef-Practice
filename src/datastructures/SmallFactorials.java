package datastructures;

import java.math.BigInteger;
import java.util.Scanner;

public class SmallFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int t = sc.nextInt();
            while(t!=0){
                int n = sc.nextInt();
                BigInteger fact = new BigInteger("1");
                while(n>0){
                    fact=fact.multiply(BigInteger.valueOf(n));
                    n--;
                }
                System.out.println(fact);
                t--;
            }
        }
    }
}
