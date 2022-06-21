/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 21-06-2022
 */

package datastructures.level2;

import java.util.Scanner;

public class ChefAndTableTennis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            String s = sc.next();
            int chef = 0;
            int opponent = 0;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '0')
                    opponent++;
                else
                    chef++;
                if(chef == 11) {
                    System.out.println("WIN");
                    break;
                }
                else if(opponent == 11) {
                    System.out.println("LOSE");
                    break;
                }
                else if(chef >= 10 && opponent >= 10){
                    if(chef>opponent && chef-opponent>=2){
                        System.out.println("WIN");
                        break;
                    }
                    else if(opponent>chef && opponent-chef == 2){
                        System.out.println("LOSE");
                        break;
                    }
                }
            }
            T--;
        }
    }
}

/*
String s1 = sc.next();
            int c = 0;
            int o = 0;
            	    for(int i=0;i<s1.length();i++){
		        if(s1.charAt(i) == '1'){
		            c++;
		        }
		        else if(s1.charAt(i) == '0'){
		            o++;
		        }
		        if(c == 11 && o<10){
		            System.out.println("WIN");
		            break;
		        }
		        else if(o==11 && c<10){
		            System.out.println("LOSE");
		            break;
		        }
		        else if(c>=10 && o>=10){
		            if(c>o && c-o>=2){
		                System.out.println("WIN");
		                break;
		            }
		            else if(o>c && o-c == 2){
		                System.out.println("LOSE");
		                break;
		            }
		        }
         }
 */