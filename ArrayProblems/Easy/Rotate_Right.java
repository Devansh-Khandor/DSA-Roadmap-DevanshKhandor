package ArrayProblems.Easy;
import java.util.Scanner;

public class Rotate_Right {
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
        System.out.println("Enter the number of rotations");
        int k = ob.nextInt();
        rotate(arr, k);
        System.out.println(java.util.Arrays.toString(arr));
    }

    public static void rotate(int arr[], int k){
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
    }

    public static void reverse(int arr[], int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
