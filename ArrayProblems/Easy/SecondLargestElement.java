// Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

// Note: The second largest element should not be equal to the largest element.

package ArrayProblems.Easy;

import java.util.Scanner;

public class SecondLargestElement {

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
        System.out.println("The second largest element in the array is: "+getSecondLargest(arr));
    }

    public static int getSecondLargest(int[] arr) {
        // code here
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max == Integer.MIN_VALUE){
                max = arr[i];
            }
            else if(second == Integer.MIN_VALUE){
                if(arr[i]>max){
                    second = max;
                    max = arr[i];
                }
                else if(arr[i]<max){
                    second = arr[i];
                }
                else{
                    
                }
            }
            else{
                if(arr[i]>max){
                    second = max;
                    max = arr[i];
                }
                else if(arr[i]>second && arr[i]<max){
                    second = arr[i];
                }
                else{
                    
                }
            }
        }
        if(second == Integer.MIN_VALUE){
            return -1;
        }
        else{
            return second;
        }
    }
}
