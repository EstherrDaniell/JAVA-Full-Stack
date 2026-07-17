package jfs_exp1.LC3;
import java.util.*;
public class Activity5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=30;
        int c[]=new int[10];
        System.out.println("Enter 30 marks:");
        for(int i=0;i<n;i++){
            int m=sc.nextInt();
            if(m<=10)
                c[0]++;
            else if(m<=20)
                c[1]++;
            else if(m<=30)
                c[2]++;
            else if(m<=40)
                c[3]++;
            else if(m<=50)
                c[4]++;
            else if(m<=60)
                c[5]++;
            else if(m<=70)
                c[6]++;
            else if(m<=80)
                c[7]++;
            else if(m<=90)
                c[8]++;
            else
                c[9]++;
        }
        System.out.println("0-10  : "+c[0]);
        System.out.println("11-20 : "+c[1]);
        System.out.println("21-30 : "+c[2]);
        System.out.println("31-40 : "+c[3]);
        System.out.println("41-50 : "+c[4]);
        System.out.println("51-60 : "+c[5]);
        System.out.println("61-70 : "+c[6]);
        System.out.println("71-80 : "+c[7]);
        System.out.println("81-90 : "+c[8]);
        System.out.println("91-100: "+c[9]);
    }
}

