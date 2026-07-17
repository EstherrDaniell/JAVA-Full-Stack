package jfs_exp1.LC3;
import java.util.*;
public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[20];
        System.out.println("Enter 20 numbers:");
        for(int i=0;i<20;i++)
            a[i]=sc.nextInt();
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE,min3=Integer.MAX_VALUE;
        for(int x:a){
            if(x>max1){
                max3=max2;
                max2=max1;
                max1=x;
            }
            else if(x>max2){
                max3=max2;
                max2=x;
            }
            else if(x>max3){
                max3=x;
            }
            if(x<min1){
                min3=min2;
                min2=min1;
                min1=x;
            }
            else if(x<min2){
                min3=min2;
                min2=x;
            }
            else if(x<min3){
                min3=x;
            }
        }
        System.out.println("Maximum 3: "+max1+" "+max2+" "+max3);
        System.out.println("Minimum 3: "+min1+" "+min2+" "+min3);
    }
}

