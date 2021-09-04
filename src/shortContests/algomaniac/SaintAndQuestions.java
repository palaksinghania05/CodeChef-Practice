package shortContests.algomaniac;

import java.util.Scanner;

public class SaintAndQuestions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            while(T>0){
               /* byte A0 = sc.nextByte();
                byte A1 = sc.nextByte();
                byte A2 = sc.nextByte();
                byte B0 = sc.nextByte();
                byte B1 = sc.nextByte();
                byte B2 = sc.nextByte();
                byte saintCorrect = 0;
                byte saintWrong = 0;
                byte heroCorrect = 0;
                byte heroWrong = 0;
                if(A0==1)
                    saintCorrect++;
                else
                    saintWrong++;
                if(A1==1)
                    saintCorrect++;
                else
                    saintWrong++;
                if(A2==1)
                    saintCorrect++;
                else
                    saintWrong++;
                if(B0==1)
                    heroCorrect++;
                else
                    heroWrong++;
                if(B1==1)
                    heroCorrect++;
                else
                    heroWrong++;
                if(B2==1)
                    heroCorrect++;
                else
                    heroWrong++;
                if(saintCorrect==heroCorrect && saintWrong==heroWrong)
                    System.out.println("Pass");
                else
                    System.out.println("Fail");*/
                int saint=0,hero=0;
                int[] arr1 = new int[3];
                int[] arr2 = new int[3];
                for(int i=0;i<3;i++)
                {
                    arr1[i]=sc.nextInt();
                }
                for(int i=0;i<3;i++)
                {
                    arr2[i]=sc.nextInt();
                }
                for(int i=0;i<3;i++)
                {
                    if(arr1[i]==1)
                    {
                        saint++;
                    }
                    if(arr2[i]==1)
                    {
                        hero++;
                    }
                }
                if(saint==hero)
                {
                    System.out.println("Pass");
                }
                else
                {
                    System.out.println("Fail");
                }
            }
        }
    }
}