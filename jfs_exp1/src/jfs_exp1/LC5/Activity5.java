package jfs_exp1.LC5;
import java.util.*;
public class Activity5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[10];
        System.out.println("Enter first array:");
        for(int i=0;i<5;i++)
            a[i]=sc.nextInt();
        System.out.println("Enter second array:");
        for(int i=0;i<5;i++)
            b[i]=sc.nextInt();
        for(int i=0;i<4;i++)
            for(int j=i+1;j<5;j++)
                if(a[i]<a[j]){
                    int t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
        for(int i=0;i<4;i++)
            for(int j=i+1;j<5;j++)
                if(b[i]<b[j]){
                    int t=b[i];
                    b[i]=b[j];
                    b[j]=t;
                }
        int k=0;
        for(int i=0;i<5;i++)
            c[k++]=a[i];
        for(int i=0;i<5;i++)
            c[k++]=b[i];
        System.out.println("Merged Array:");
        for(int x:c)
            System.out.print(x+" ");
    }
}


