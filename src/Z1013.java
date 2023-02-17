import java.sql.SQLOutput;
import java.util.Scanner;


public class Z1013 {
    public static void main(String[] args){
        System.out.println("请输入一个数：");
        len();
    }

    public static void len(){

        Scanner input=new Scanner(System.in);
        int num= input.nextInt();


       /*Scanner input=new Scanner(System.in);
        int num=input.nextInt();

        Scanner input=new Scnner(System.in);
        int num=input.nextInt()
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        Scanner input=new Scanner(System.in)
        int num=input.nextInt();
        */





        int length=0;
        while(num!=0){
            num=num/10;
            length++;
        }
            System.out.println("数字的长度为："+length);
    }

    public static void z2(){
        int sum2=0;
        int n=2;
        int m=3;
        sum2=n^m;
        System.out.println("n的m次方为"+"sum2");

    }
}
