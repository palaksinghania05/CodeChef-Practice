package beginner1;

import java.util.Scanner;

public class DiagonalMovement {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
	   int t=kb.nextInt();
	   while(t-->0){
	       int a=kb.nextInt();
	       int b=kb.nextInt();
	       
	       a=a<0?-a:a;
	       b=b<0?-b:b;
	       
	       if((a+b)%2==0)
	        System.out.println("YES");
	       else
	        System.out.println("NO");
	   }
    }
}
