package ArrayProblems;

import java.util.Scanner;

public class RemoveDuplicatesFromSortedArray {
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
        int k = removeDuplicates(arr);
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if(n==0 || n==1){
            return n;
        }
        int k = 1;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[k-1]){
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
}
