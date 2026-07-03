import java.util.Scanner;

public class Pattern19 {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = ob.nextInt();
        n = n/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*n;j++){
                if(j<=n-i+1 || j>=n+i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

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
    }
}
