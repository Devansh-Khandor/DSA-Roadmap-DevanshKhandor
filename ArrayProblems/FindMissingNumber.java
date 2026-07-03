package ArrayProblems;

import java.util.Scanner;

public class FindMissingNumber {
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
        System.out.println("The missing number in the array is: "+ missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        int n = arr.length;
        int sum = ((n)*(n+1))/2;
        for(int i=0;i<n;i++){
            sum = sum - arr[i];
        }
        return sum;
    }
}
