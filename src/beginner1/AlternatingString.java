package beginner1;

import java.util.Scanner;

public class AlternatingString {
    public static void main(String[] args) {
        	Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0){
		    int n = s.nextInt();
		    String st = s.next();
		    int one =0, zero =0;
		    for(int i=0;i<n;i++){
		        if(st.charAt(i) == '0'){
		            zero++;
		        }else one++;
		    }
		    if(one==zero) System.out.println(one*2);
	        else if(one<zero) System.out.println(one*2+1);
	        else System.out.println(zero*2+1);
		}
    }
}
