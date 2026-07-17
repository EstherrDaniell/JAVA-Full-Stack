package jfs_exp1.LC4;
import java.util.*;
public class Activity2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        String result = "";
        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                result += 'z';
                found = true;
            } else {
                result += ch;
            }
        }
        if(found)
            System.out.println(result);
        else
            System.out.println(s + "\nNo vowels present");
    }
}

