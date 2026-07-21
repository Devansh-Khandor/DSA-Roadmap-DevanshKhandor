package ArrayProblems.Medium;

import java.util.*;

public class PrintSubarrayWithMaximumSum {
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
        int ans[] = subarray(arr);
        for(int i=ans[0];i<=ans[1];i++){
            System.out.print(arr[i]+" ");
        }
        
    }

    public static int[] subarray(int arr[]){
        int currSum = arr[0];
        int maxSoFar = arr[0];

        int max_start = 0;
        int max_end = 0;
        int curr_start = 0;

        for(int i=1;i<arr.length;i++){
            if(currSum+arr[i]<arr[i]){
                currSum = arr[i];
                curr_start = i;
            }
            else{
                currSum = currSum+arr[i];
            }

            if(currSum>maxSoFar){
                maxSoFar = currSum;
                max_start = curr_start;
                max_end = i;
            }
        }
        return new int[]{max_start,max_end};
    }


}
