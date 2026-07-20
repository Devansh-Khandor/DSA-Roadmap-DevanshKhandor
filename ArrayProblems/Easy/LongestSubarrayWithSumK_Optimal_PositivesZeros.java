package ArrayProblems.Easy;

import java.util.Scanner;

public class LongestSubarrayWithSumK_Optimal_PositivesZeros {
    public static void main(String args[]){
        @SuppressWarnings("resource")
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
        System.out.println("Enter the value of k");
        int k = ob.nextInt();
        longestSubarray(arr, k);
    }

    public static void longestSubarray(int arr[], int k){
        int n = arr.length;
        int i =0;
        int j = 0;
        int sum = arr[0];
        int maxLength = 0;

        while(j<n){
            if(i<=j && sum>k){
                sum = sum - arr[i];
                i++;
            }
            if(sum == k){
                maxLength = Math.max(maxLength, j-i+1);
            }
            j++;
            if(j<n){
                sum = sum + arr[j];
            }
        }
        System.out.println("The length of the longest subarray with sum " + k + " is: " + maxLength);
    }

}
