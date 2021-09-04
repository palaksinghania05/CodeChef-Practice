package beginner;

import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int t = sc.nextInt();
            while(t>0){
                int n = sc.nextInt();
                if(n < 2)
                    System.out.println("no");
                else{
                    int count = 0;
                    for(int i = 2; i < n ; i++){
                        if(n%i == 0){
                            count ++ ;
                            break;
                        }
                    }
                    if(count>0)
                        System.out.println("no");
                    else
                        System.out.println("yes");
                }
                t--;
            }
        }
    }
}
