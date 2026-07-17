package jfs_exp1.LC2;
import java.util.*;
public class Activity1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int n = sc.nextInt();
        int count = 0;
        if (n == 0)
            count = 1;
        else {
            while (n != 0) {
                count++;
                n /= 10;
            }
        }
        System.out.println(count);
    }
}