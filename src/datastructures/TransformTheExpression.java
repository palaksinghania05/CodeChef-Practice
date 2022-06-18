/*
 * Author Name: Palak Singhania
 * IDE: IntelliJ IDEA Ultimate Edition
 * Date: 18-06-2022
 */

package datastructures;

import java.util.Scanner;
import java.util.Stack;

public class TransformTheExpression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            String exp = sc.next();
            String RPN = "";
            Stack<Character> stack = new Stack<>();
            for(int i = 0; i < exp.length(); i++){
                if(exp.charAt(i)=='(') {
                    stack.push(exp.charAt(i));
                }
                else if(exp.charAt(i)>='a' && exp.charAt(i)<='z') {
                    RPN += exp.charAt(i);
                }
                else if(exp.charAt(i)=='+' || exp.charAt(i)=='-' || exp.charAt(i)=='*'  || exp.charAt(i)=='/' || exp.charAt(i)=='^') {
                    stack.push(exp.charAt(i));
                }
                else if(exp.charAt(i)==')') {
                    char operation = stack.pop();
                    RPN += operation;
                    stack.pop();
                }
            }
            System.out.println(RPN);
            T--;
        }
    }
}
