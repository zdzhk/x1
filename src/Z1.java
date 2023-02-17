import java.util.Scanner;

public class Z1 {
    public static void main(String []args){
        //不优惠的总价
        double money1=24+8+3;
        //判断折后价格
        money1=(money1<=30?money1:money1*0.8);
        double money2=16+8+3;
        double money=money1>money2?money2:money1;
        System.out.println(money);

        //提示并接受用户的数据
        System.out.println("请输入数据：");
        int input=new Scanner(System.in).nextInt();
        //判断数据
        if(input==1){
            System.out.println("星期一");
        }else if(input==2) {
            System.out.println("星期二");
        }else if(input==3){
            System.out.println("星期三");
        }else if(input==4){
            System.out.println("星期四");
        }else if(input==5){
            System.out.println("星期五");
        }else if(input==6){
            System.out.println("星期六");
        }else if(input==7) {
            System.out.println("星期日");
        }else{
            System.out.println("不在范围内，请输入1-7的数据");
        }



    }
//键盘输出 Scanner
/*System.out.println("输入第一个整数");
    int a=new Scanner(System.in).nextInt();*/



}
