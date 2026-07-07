package ArrayProblems.Easy;

import java.util.Scanner;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int xor = 0;
        for(int i=0;i<nums.length;i++){
            xor = xor^nums[i];
        }
        return xor;
    }
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

        System.out.println("The largest element in the array is: "+singleNumber(arr));
    }


}
