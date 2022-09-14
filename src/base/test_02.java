package base;

public class test_02 {
    public static void main(String[] args) {
        String a = "jiangyujun";
        int n1 = 0x11;//16进制，0开头八进制
        char n2 = '蒋';
        char n3 = '\u0061';//unicode 编码转换
        System.out.println(n2);
        System.out.println((int)n2);
        System.out.println(n3);
        System.out.println((char)100);//强制类型转换 ，byte,short,char---int---long---float---double
        System.out.println(a);
        System.out.println(n1);
    }
}
