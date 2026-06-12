public class Pattern6 {
    public static void main(String args[]){
        int c = 1;
        for(int i=1;i<=5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(c);
                c++;
            }
            c=1;
            System.out.println();
        }
    }
}
