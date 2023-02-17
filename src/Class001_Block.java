/*
    块 : {}
        自成作用域
                                                                    执行时机 :
        {}定义局部位置--> 局部代码块|普通语句块                           跟随所在方法的调用执行
            1)语义化   2)自成作用域
        {}定义成员位置--> 成员代码块|构造块                              跟随new执行
            1)为对象成员变量进行初始化   2)为所有对象做初始的设置内容
        static{}定义在成员位置 --> 静态块                               在类第一次加载完成之后
            1)为静态变量做初始化     2)做一些程序的加载配置|初始设置
        同步块

   注意 :
    变量的值一旦修改不可恢复
    构造块会先于构造器代码之前执行,因为编译期间,构造块中的代码会被编译到要执行的构造器代码的内部的最上面
    如果存在多个构造块,从上到下依次执行
    静态块中的代码在类第一次加载完成之后就执行,并且只执行一次
    如果存在多个静态块,从上到下依次执行
 */
public class Class001_Block {
    //成员
    static int i;

    public Class001_Block(){
        System.out.println("构造器");
    }

    //成员代码块
    {
        System.out.println("成员代码块1");
    }
    {
        System.out.println("成员代码块2");
    }
    {
        System.out.println("成员代码块3");
    }

    //static静态块
    static{
        if(i==0){
            i = 1;
        }
        System.out.println("静态块1");
    }
    static{
        System.out.println("静态块2");
    }
    static{
        System.out.println("静态块3");
    }


    public static void main(String[] args) {
        //局部变量
        //int i = 10;
        //局部代码块
        {
            int i = 100;
            System.out.println(i);
        }
        System.out.println(i);

        new Class001_Block();

        User user = new User(20);
        user.show();
    }
}

class User{
    String name;
    int age;

    {
        age = 18;
    }
    public User(){
    }
    public User(String name){
        this.name = name;
    }

    public User(int age){
        this.age = age;
    }

    public void show(){
        System.out.println(name+"--->"+age);
    }
}