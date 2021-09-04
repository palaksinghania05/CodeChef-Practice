/*
A certain type of steel is graded according to the following conditions.
Hardness of the steel must be greater than 50
Carbon content of the steel must be less than 0.7
Tensile strength must be greater than 5600

The grades awarded are as follows:
Grade is 10 if all three conditions are met
Grade is 9 if conditions (1) and (2) are met
Grade is 8 if conditions (2) and (3) are met
Grade is 7 if conditions (1) and (3) are met
Grade is 6 if only one condition is met
Grade is 5 if none of the three conditions are met

Write a program to display the grade of the steel, based on the values of hardness, carbon content and
tensile strength of the steel, given by the user.
 */

package beginner;

import java.util.Scanner;

public class GradeTheSteel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int t = sc.nextInt();
            while(t>0){
                int hardness = sc.nextInt();
                float carbon = sc.nextFloat();
                int tensile = sc.nextInt();
                if(hardness>50 && carbon<0.7 && tensile>5600)
                    System.out.println(10);
                else if(hardness>50 && carbon<0.7)
                    System.out.println(9);
                else if(carbon<0.7 && tensile>5600)
                    System.out.println(8);
                else if(hardness>50 && tensile>5600)
                    System.out.println(7);
                else if(hardness<=50 && carbon>=0.7 && tensile<=5600)
                    System.out.println(5);
                else
                    System.out.println(6);
                t--;
            }
        }
    }
}
