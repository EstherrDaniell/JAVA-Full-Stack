package jfs_exp3;

import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the number of elements in the array");
            String sizeInput = sc.nextLine();
            int size = Integer.parseInt(sizeInput);
            int[] arr = new int[size];
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < size; i++) {
                String input = sc.nextLine();
                arr[i] = Integer.parseInt(input);
            }
            System.out.println("Enter the index of the array element you want to access");
            String indexInput = sc.nextLine();
            int index = Integer.parseInt(indexInput);
            System.out.println("The array element at index " + index + " = " + arr[index]);
            System.out.println("The array element successfully accessed");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }
        catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
        }
        sc.close();
    }
}

