package beginner;

import java.util.Arrays;
import java.util.Scanner;

public class TurboSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        while(sc.hasNextInt()) {
            int t = sc.nextInt();
            arr = new int[t];
            for (int i = 0; i < t; i++) {
                arr[i] = sc.nextInt();
            }
		/*for(int i = 0;i<arr.length;i++){
		 for(int j = 0 ; j<arr.length;j++){
		  if(arr[i]<arr[j]){
		   int temp = arr[i];
		   arr[i] = arr[j];
		   arr[j] = temp;
		  }
		 }
		}*/
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }
}
