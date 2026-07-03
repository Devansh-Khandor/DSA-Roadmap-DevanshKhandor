
// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

// There may be duplicates in the original array.

// Note: An array A rotated by x positions results in an array B of the same length such that B[i] == A[(i+x) % A.length] for every valid index i.

package ArrayProblems;

import java.util.Scanner;

public class CheckIfArrayIsSorted {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of elements in your array");
        int n = ob.nextInt(); // Read number of elements
        int arr[] = new int[n]; // Declare array of size n
        System.out.println("Start entering your elements");

        for(int i=0;i<arr.length;i++){
            System.out.print("Element "+(i+1)+": ");
            arr[i] = ob.nextInt();
            System.out.println();
        }

        System.out.println(check(arr));

    }
    public static boolean check(int[] arr) {
        int n = arr.length;
        int c = 0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n]){
                c++;
            }
        }
        return c<=1;
    }
}
