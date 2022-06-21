/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 23-06-2022
 */

package datastructures.level2;

import java.util.HashMap;
import java.util.Scanner;

public class ThatIsMyScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int N = sc.nextInt();
            HashMap<Integer, Integer> problems = new HashMap<>();
            for (int i = 0; i < N; i++) {
                int p = sc.nextInt();
                int s = sc.nextInt();
                if(!problems.containsKey(p)){
                    problems.put(p,s);
                } else {
                    if(problems.get(p)<s)
                        problems.put(p,s);
                }
            }
            int score = 0;
            for (Integer ele : problems.keySet()) {
                if(ele == 9 || ele == 10 || ele == 11)
                    continue;
                else
                    score = score + problems.get(ele);
            }
            System.out.println(score);
            T--;
        }
    }
}
