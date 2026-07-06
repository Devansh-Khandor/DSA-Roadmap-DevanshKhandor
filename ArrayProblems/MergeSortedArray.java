package ArrayProblems;

import java.util.Scanner;

public class MergeSortedArray {

    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of elements in your first array");
        int m = ob.nextInt();
        int arr1[] = new int[m*2];
        System.out.println("Start entering your elements for first array");
        for(int i=0;i<m;i++){
            System.out.print("Element "+(i+1)+": ");            
            arr1[i] = ob.nextInt();
            System.out.println();
        }
        System.out.println("Enter the number of elements in your second array");
        int n = ob.nextInt();
        int arr2[] = new int[n];
        System.out.println("Start entering your elements for second array");
        for(int i=0;i<n;i++){
            System.out.print("Element "+(i+1)+": ");            
            arr2[i] = ob.nextInt();
            System.out.println();
        }
        MergeSortedArray obj = new MergeSortedArray();
        obj.merge(arr1, m, arr2, n);
        for(int i=0;i<m+n;i++){
            System.out.print(arr1[i]+" ");
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = nums1;
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
            if(arr[i]<nums2[j]){
                nums1[k] = arr[i];
                i++;
            }
            else{
                nums1[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i<m){
            nums1[k] = arr[i];
            i++;
            k++;
        }
        while(j<n){
            nums1[k] = nums2[j];
            j++;
            k++;
        }
    }
}
