package struct;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i= 1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k = 0;k<=i;k++){
                System.out.print("*");
            }
            for(int p =1;p<i;p++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
