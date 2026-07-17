package jfs_exp1.LC1;
import java.util.*;
public class Activity1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = a;
		int t = b;
		a = c;
		b = s;
		c = t;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		sc.close();
	}
}
