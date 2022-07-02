/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 01-07-2022
 */

package datastructures.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lapindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            String s = sc.next();
            int n = s.length();
            String partA = s.substring(0,n/2);
            String partB;
            if(n%2==0){
                partB = s.substring(n/2,n);
            } else{
                partB = s.substring(n/2+1,n);
            }
            ArrayList<Character> listA = new ArrayList<>();
            ArrayList<Character> listB = new ArrayList<>();
            ArrayList<Character> listC = new ArrayList<>();
            ArrayList<Character> listD = new ArrayList<>();
            for (int i = 0; i < partA.length(); i++) {
                if(!listA.contains(partA.charAt(i)))
                    listA.add(partA.charAt(i));
                listC.add(partA.charAt(i));
            }
            for (int i = 0; i < partB.length(); i++) {
                if(!listB.contains(partB.charAt(i)))
                    listB.add(partB.charAt(i));
                listD.add(partB.charAt(i));
            }
            Collections.sort(listA);
            Collections.sort(listB);
            if(listA.equals(listB)){
                //System.out.println(listC);
                //System.out.println(listD);
                for (int i = 0; i < listC.size(); i++) {
                    if(listD.contains(listC.get(i))) {
                        listD.remove(listC.get(i));
                    }
                }
                //System.out.println(listC);
                //System.out.println(listD);
                if(listD.size() == 0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else{
                System.out.println("NO");
            }
            T--;
        }
    }
}
