package ArrayProblems.Medium;

import java.util.Scanner;

public class SortArray012 {
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

        sortColors(arr);
        print(arr);
    }

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void sortColors(int[] arr) {
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i=0;i<arr.length;i++){
            switch (arr[i]) {
                case 0 -> a++;
                case 1 -> b++;
                default -> c++;
            }
        }
        for(int i=0;i<a;i++){
            arr[i] = 0;
        }
        for(int i=a;i<a+b;i++){
            arr[i] = 1;
        }
        for(int i=a+b;i<a+b+c;i++){
            arr[i] = 2;
        }
    }
}
