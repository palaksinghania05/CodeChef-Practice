package beginner;/*
In a company an emplopyee is paid as under: If his basic salary is less than Rs. 1500,
then HRA = 10% of base salary and DA = 90% of basic salary.
If his salary is either equal to or above Rs. 1500, then HRA = Rs. 500 and DA = 98% of basic salary.
If the Employee's salary is input, write a program to find his gross salary.
*/

import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // while(sc.hasNext()){
            int t = sc.nextInt();
            while(t-->0){
                float salary = sc.nextInt();
                if(salary<1500){
                    float hra = (10*salary)/100;
                    float da = (90*salary)/100;
                    float gross_salary = salary+hra+da;
                    System.out.println(String.format("%.2f", gross_salary));
                }
                else{
                    float hra = 500;
                    float da = (98*salary)/100;
                    float gross_salary = salary+hra+da;
                    System.out.println(String.format("%.2f", gross_salary));
                }
            }
        }
    }
//}
