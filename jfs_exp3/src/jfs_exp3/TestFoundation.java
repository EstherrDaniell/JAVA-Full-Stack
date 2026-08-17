package jfs_exp3;
import test_package.foundation;

public class TestFoundation {

    public static void main(String[] args) {

        foundation obj = new foundation();

        System.out.println("Private variable: Not accessible");
        System.out.println("Default variable: Not accessible");
        System.out.println("Protected variable: Not accessible");
        System.out.println("Public variable: " + obj.var4);
    }
}