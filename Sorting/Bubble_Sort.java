package Sorting;
import java.util.*;

/**
 * Demonstrates Bubble Sort on an integer array read from standard input.
 * 
 * Bubble Sort repeatedly swaps adjacent out-of-order elements.
 * 
 * Time Complexity:
 *   - Worst/average: O(n^2)
 *   - Best (already sorted with early exit): O(n)
 * Space Complexity: O(1) auxiliary
 */

public class Bubble_Sort {

    //Sorts the given array using Bubble Sort algorithm.
    public static void bubblesort(int arr[], int len){
        // Outer loop runs (len - 1) times, placing one element in its correct position each pass
        for(int i=0;i<len-1;i++){
            boolean swapped = false;
            // Inner loop compares adjacent elements and swaps if they are in wrong order
            for(int j=0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;// Mark that a swap occurred
                }
            }
            // If no swaps were made, array is already sorted — exit early for efficiency
            if(!swapped){
                break;
            }
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

        // Call bubble sort function
        bubblesort(arr, arr.length);

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
