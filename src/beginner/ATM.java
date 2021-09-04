package beginner;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int x = sc.nextInt();
            double y = sc.nextDouble();
            double result = getBalance(x,y);
            System.out.println(result);
        }
    }
    public static double getBalance(int x, double y){
        if(x <= y && x % 5 == 0 && (y - x - 0.50) >= 0){
            return (y - x - 0.50);
        }
        else{
            return y;
        }
    }
}
