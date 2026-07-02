import java.util.*;

public class Pattern18 {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = ob.nextInt();

        char c = 'A';
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                System.out.print((char)(c+n-j));
            }
            System.out.println();
        }
    }
}
