/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 30-06-2022
 */

package datastructures.level2;

import java.util.HashMap;
import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            String[] arr = new String[N];
            HashMap<String, Integer> first = new HashMap<>();
            for (int i = 0; i < N; i++) {
                arr[i] = sc.next() + " " + sc.next();
                int idx = arr[i].lastIndexOf(" ");
                String firstName = arr[i].substring(0,idx);
                if(!first.containsKey(firstName))
                    first.put(firstName,1);
                else
                    first.put(firstName, first.get(firstName)+1);
            }
            for (int i = 0; i < N; i++) {
                int idx = arr[i].lastIndexOf(" ");
                String firstName = arr[i].substring(0,idx);
                if(first.get(firstName)>1)
                    System.out.println(arr[i]);
                else
                    System.out.println(firstName);
            }
            T--;
        }
    }
}
