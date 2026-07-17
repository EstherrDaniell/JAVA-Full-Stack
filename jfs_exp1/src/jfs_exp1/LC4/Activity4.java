package jfs_exp1.LC4;
import java.util.*;
public class Activity4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int count = 1;
            if(ch==' ')
                continue;
            boolean visited = false;
            for(int k=0;k<i;k++)
                if(s.charAt(k)==ch)
                    visited=true;
            if(visited)
                continue;
            for(int j=i+1;j<s.length();j++)
                if(ch==s.charAt(j))
                    count++;
            System.out.println(ch+" - "+count);
        }
    }
}

