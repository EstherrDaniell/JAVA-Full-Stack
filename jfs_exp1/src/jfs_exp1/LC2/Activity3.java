package jfs_exp1.LC2;
import java.util.*;
public class Activity3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to convert to binary");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        int bin = 0, place = 1;
        while (n > 0) {
            int rem = n % 2;
            bin += rem * place;
            place *= 10;
            n /= 2;
        }
        System.out.println(bin);
    }
}
