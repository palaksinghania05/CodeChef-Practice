package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    int no_0f_submissions = sc.nextInt();
		    int count_of_delays = 0;
		    int s[] = new int[no_0f_submissions];
		    int j[] = new int[no_0f_submissions];
		    for(int i=0;i<no_0f_submissions;i++)
		    {
		        s[i] = sc.nextInt();
		        j[i] = sc.nextInt();
		        int delay = j[i] - s[i];
		        if(delay > 5) count_of_delays++;
		    }
		    System.out.printf("%d \n",count_of_delays);
		}
	}
}
