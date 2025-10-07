package Sorting;
import java.util.*;

/**
 * Demonstrates Selection Sort on an integer array read from standard input.
 * 
 * Selection Sort repeatedly finds the minimum element from the unsorted part of the array
 * and places it at the beginning.
 * 
 * Time Complexity:
 *   - Worst/Average/Best: O(n^2)
 * Space Complexity: O(1)
 */

public class Selection_Sort {

    public static void selectionsort(int arr[], int len){
        // One by one, move the boundary of the unsorted subarray
        for(int i=0;i<len;i++){
            int smallest = i;// Assume current index has the smallest element

            // Find the index of the smallest element in the unsorted portion
            for(int j=i+1;j<len;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;// Update the index of the new smallest element
                }
            }
            // Swap the found smallest element with the element at index i
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }

    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of elements in your array");
        int n = ob.nextInt(); // Read number of elements
        int arr[] = new int[n]; // Declare array of size n
        System.out.println("Start entering your elements");

        // Input each element from user
        for(int i=0;i<arr.length;i++){
            System.out.print("Element "+(i+1)+": ");
            arr[i] = ob.nextInt();
            System.out.println();
        }

        // Call selection sort function
        selectionsort(arr, arr.length);

        // Print sorted array
        print(arr, arr.length);
    }

    //Prints the elements of the array separated by spaces.
    public static void print(int arr[], int len){
        // Loop through array and print each element
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
