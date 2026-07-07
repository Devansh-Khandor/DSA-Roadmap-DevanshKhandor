package ArrayProblems.Medium;

import java.util.Scanner;

public class RearrangeArrayBySign {
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

        int nums[] = rearrangeArray(arr);
        print(nums);
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int[] rearrangeArray(int[] arr) {
        int n = arr.length;
        int nums[] = new int[n];
        int i=0;
        int j=1;

        for(int k=0;k<n;k++){
            if(arr[k]>0){
                nums[i]=arr[k];
                i+=2;
            }
            else{
                nums[j] = arr[k];
                j+=2;
            }
        }
        return nums;
    }
}
