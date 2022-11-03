/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 03-11-2022
 */

package beginner;

import java.util.*;

public class IsItAVowelOrConsonant {
    public static void main(String[] args) {
        char[] vowels = {'A', 'E', 'I', 'O', 'U'};
        Scanner sc = new Scanner(System.in);
        char C = sc.next().charAt(0);
      //  System.out.println(C);
        if(isfound(vowels,C))
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }

    public static boolean isfound(char[] arr, char ch){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ch)
                return true;
        }
        return false;
    }
}
