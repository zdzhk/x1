import java.util.Scanner;

public class T1 {
    public static void main(String[] args){
        System.out.print("输入整数，求阶乘：");
        int n = new Scanner(System.in).nextInt();
        //调用f()方法，把n的值传递到f()方法，求阶乘
        f(n);

    }

    public static void f (int n){
        if(n<0){//判定是否为负数
            System.out.println("负数无法求取阶乘，请输入正整数");
        }
        if(n==0){
            System.out.println("0的阶乘是 1");
        }
        /*
         * 5阶乘=5*4*3*2*1
         * */
        long r=n;
        for(int i=n-1;i>=1;i--){
            r=r*i;
        }
        System.out.println(n+"的阶乘："+r);
    }

}
