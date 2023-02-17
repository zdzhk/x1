public class Kl {
    public static void main(String[] args){
  /*      20/3=6.2    30/3=10
         6/3=2       10/3=3.1
         2+2/3=1        3+0/3=1
        sum=6+2+1;*/
        int s=20;//总钱数
        int p=3; //单价
        int a=1; //瓶盖价格
        int c; // 总共多少瓶
        int b;//钱买的瓶数的多于的钱
        b=s%p;
        c=s/p+s/p^2+(b+s/p^2)/p;
        System.out.println("可以买"+c+"瓶");
    }
    public static void m(){
        System.out.println();
    }
}
