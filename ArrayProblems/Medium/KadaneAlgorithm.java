package ArrayProblems.Medium;

import java.util.*;

public class KadaneAlgorithm {
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
        System.out.println("The maximum sum of subarray is: "+brute(arr));
        System.out.println("The maximum sum of subarray is: "+better(arr));
        System.out.println("The maximum sum of subarray is: "+optimal(arr));
    }

    public static int brute(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum += arr[k];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static int better(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static int optimal(int arr[]){
        int currMax = arr[0];
        int maxSoFar = arr[0];
        for(int i=1;i<arr.length;i++){
            currMax = Math.max(currMax+arr[i],arr[i]);
            maxSoFar = Math.max(currMax, maxSoFar);
        }
        return maxSoFar;
    }
}
