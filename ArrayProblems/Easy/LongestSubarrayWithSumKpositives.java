package ArrayProblems.Easy;

import java.util.*;

public class LongestSubarrayWithSumKpositives {
    //Array has positives and zeros only
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
        int sum = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            if(sum == k){
                maxLength = Math.max(maxLength, i+1);
            }
            int rem = sum-k;
            if(map.containsKey(rem)){
                maxLength = Math.max(maxLength, i-map.get(rem));
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        System.out.println("The length of the longest subarray with sum " + k + " is: " + maxLength);
    }

}
