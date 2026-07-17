package jfs_exp1.LC1;
import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pass = 0;
        System.out.println("Enter marks:");
        for (int i = 0; i < 3; i++) {
            int mark = sc.nextInt();
            if (mark >= 35)
                pass++;
        }

        System.out.println("Number of Passed students:" + pass);
        sc.close();
    }
}