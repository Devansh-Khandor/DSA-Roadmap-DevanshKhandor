import java.util.Scanner;

public class Pattern20 {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = ob.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n;j++){
                if(j<=i || j>=2*n-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=2*n;j++){
                if(j<=i || j>=2*n-i+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
