package Sorting;
import java.util.*;

/**
 * Demonstrates Insertion Sort on an integer array read from standard input.
 * 
 * Insertion Sort builds the sorted array one element at a time by
 * inserting each element into its correct position among previously sorted elements.
 * 
 * Time Complexity:
 *   - Worst/Average: O(n^2)
 *   - Best (already sorted): O(n)
 * Space Complexity: O(1)
 */

public class Insertion_Sort {

    public static void insertionsort(int arr[], int len){
        // Start from the second element (index 1) since the first is trivially sorted
        for(int i=1;i<len;i++){
            int current = arr[i];// The element to be placed in correct position
            int j = i-1;

            // Shift elements of the sorted segment forward to make space for current
            // Continue shifting while current element is smaller than arr[j]
            while(j>=0 && arr[j]>current){
                arr[j+1] = arr[j];
                j--;// Shift element one position ahead
            }

            // Place the current element into its correct sorted position
            arr[j+1] = current;
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

        // Call insertion sort function
        insertionsort(arr, arr.length);

        // Print sorted array
        print(arr, arr.length);
    }

    //Prints the elements of the array separated by spaces.
    public static void print(int arr[], int len){
        // Loop through array and print each element
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
    }

    
}
