import java.sql.SQLOutput;

public class Lx {
    public static void main(String[] args) {
        //打印一个*
        System.out.println("*");
        //打印一排七个*
        for(int i=1;i<=7;i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println("=================================");
        //打印七排七个星星
        for(int row=1;row<=7;row++){
            for(int i=1;i<=7;i++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=================================");
        //打印直角三角形
        /*
        * 行   星星   空格
        * 1     1    3
        * 2     3    2
        * 3     5    1
        * 4     7    0
        * n   2n-1   n-n
        * */

        for(int row=1;row<=7;row++){

            for(int i=1;i<=2*row-1;i++){
                //第n行*就是2n-1
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=================================");
        //打印等边三角形  空格
        for(int row=1;row<=7;row++){
            for(int b=1;b<=7-row;b++){
                //空格数=总行数-当前行数
                System.out.print(" ");
            }
            for(int i=1;i<=2*row-1;i++){
                //星星数=2*行数-1
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("============================================");

        for(int row=1;row<=7;row++){
            for(int b=1;b<=7-row;b++){
                //空格数=总行数-当前行数
                System.out.print(" ");
            }
            for(int i=1;i<=2*row-1;i++){
                //星星数=2*行数-1
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row=6;row>=1;row--){
            for (int b=1;b<=7-row;b++){
                System.out.print(" ");
            }
            for (int i =1;i<=row*2-1;i++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=================================");



       }
    }

