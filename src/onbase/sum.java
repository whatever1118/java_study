package onbase;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int m = 0;
        double sum = 0.0f;
        System.out.println("输入数据：");
        while(scanner.hasNextDouble()){
            double x =scanner.nextDouble();
            m++;
            sum = sum + x;
        }
        System.out.println(m+"总和"+sum);
        System.out.println(m+"平均值"+(sum/m));

        scanner.close();
    }
}
