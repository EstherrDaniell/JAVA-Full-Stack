package jfs_exp1;
import java.util.*;
public class oddoreven {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a no:");
		int n = sc.nextInt();
		if(n%2==0) {
			System.out.println("EVEN");
		}else {
			System.out.println("ODD");
		}sc.close();
	}
}