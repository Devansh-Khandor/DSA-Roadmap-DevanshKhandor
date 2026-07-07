package ArrayProblems;

import java.util.Scanner;

public class MaximumConsecutiveOnes {
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

        System.out.println("Maximum Consecutive Ones: "+findMaxConsecutiveOnes(arr));
    }
    public static int findMaxConsecutiveOnes(int[] arr) {
        int start = -1;
        int end = -1;
        int curr;
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1 && start == -1){
                start = i;
                end = i;
            }
            else if(arr[i] == 1){
                end=i;
            }
            else if(arr[i]==0 && start!=-1){
                curr = end-start+1;
                max = Math.max(curr, max);
                start = -1;
            }
        }
        if(arr[arr.length-1]==1){
            max = Math.max(max, end-start+1);
        }
        return max;
    }
}
