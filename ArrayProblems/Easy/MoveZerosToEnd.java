// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

package ArrayProblems.Easy;

import java.util.Scanner;

public class MoveZerosToEnd {
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

        moveZeroes(arr);
        print(arr);
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void moveZeroes(int[] arr) {
        int n = arr.length;
        int k = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[k]=arr[i];
                k++;
            }
        }
        for(int i=k;i<n;i++){
            arr[i] = 0;
        }
    }
}
