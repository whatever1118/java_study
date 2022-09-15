package struct;

import java.util.Scanner;

public class XunHuan {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入：");
//        int num1 = scanner.nextInt();

//        while(num1>=100){
//            System.out.println("大了");
//            System.out.println(num1);
//            num1--;
//
//        }
//        do{
//            System.out.println("还大");
//            System.out.println(num1);
//            num1--;
//        }while(num1>=90);
//        int sum = 0;
//        for (int i = 0; i <=1000; i++) {
//            if(i%5==0){
//                System.out.print(i+"\t");
//            }
//            if(i%(5*3)==0){
////                System.out.print("\n");
//                System.out.println();
//            }
//        }
//        System.out.println(sum);
//        scanner.close();
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }
}
