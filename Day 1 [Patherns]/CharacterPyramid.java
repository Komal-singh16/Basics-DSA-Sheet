import java.util.Scanner;

public class CharacterPyramid {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            //spaces loop
            for(int k=n;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print((char)(j+64));
            }
            //last part
            for(int l=1;l<i;l++){
                System.out.print((char)(i-l+64));
            }
            System.out.println();
        }
        sc.close();
    }
}
