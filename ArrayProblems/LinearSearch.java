//Given an array, arr[] of n integers, and an integer element x, find whether element x is present in the array. Return the index of the first occurrence of x in the array, or -1 if it doesn't exist.

package ArrayProblems;

import java.util.Scanner;

public class LinearSearch {

    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of elements in your array");
        int n = ob.nextInt(); 
        int arr[] = new int[n]; 
        System.out.println("Start entering your elements");

        for(int i=0;i<arr.length;i++){
            System.out.print("Element "+(i+1)+": ");
            arr[i] = ob.nextInt();
            System.out.println();
        }
        System.out.println("Enter the element you want to search");
        int x = ob.nextInt();
        int result = linearsearch(arr, x);
        if(result == -1){
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: "+result);    
        }
        
    }
    public static int linearsearch(int arr[], int x) {
        // code here
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
