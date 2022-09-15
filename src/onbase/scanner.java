package onbase;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("使用next方法接收");
//
//        if(scanner.hasNext()){//以空格为结束点
//            String str = scanner.next();
//            System.out.println("输出："+str);
//        }

        System.out.println("使用nextline方法接收");

        if(scanner.hasNextLine()){//以回车为结束点
            String str = scanner.nextLine();
            System.out.println("输出："+str);
        }

        scanner.close();//IO流使用完关闭，不一直占用资源
    }
}
