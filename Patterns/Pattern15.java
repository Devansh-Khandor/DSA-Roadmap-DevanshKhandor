public class Pattern15 {
    public static void main(String args[]){
        char c = 'A';
        for(int i=0;i<=4;i++){
            for(int j = 4;j>=i;j--){
                System.out.print(c);
                c = (char)(c+1);
            }
            c = 'A';
            System.out.println();
        }
    }
}
