/*
    static :
        静态的,成员修饰符,只能修饰成员,不能修饰局部
        修饰变量 : 静态变量|类变量
        修饰方法 : 静态方法|类方法
        static修饰的静态变量与方法的使用方式:
            1.通过类名调用
                类名.静态变量名
                类名.静态方法名(实参)
            2.通过对象调用
                对象.静态变量名
                对象.静态方法名(实参)
        修饰块 : 静态块
        修饰类 : 静态内部类
     注意 :
         成员是属于对象的,必须跟随对象使用,因为存在与对象的堆内存中,有多少对象的堆内存,就有多少分成员变量
         静态的是属于类的,可以直接跟随类名使用,可以跟随对象使用
         静态变量是独一份的,是属于类的,存在与静态区中,在类第一次加载完成后就初始化,只初始化一次
         静态与成员的初始加载顺序 ： 先静态后成员
         一个类的静态变量被这个类型所有的对象共享的

     分类 :
        成员变量 : 定义在成员位置的变量就是成员变量
            实例变量 : 没有被static修饰的成员变量
            静态变量|类变量 : 被static修饰的成员变量
        成员方法 : 定义在成员位置的方法
            实例方法 :  没有被static修饰的方法
            静态方法|类方法 : 被static关键字修饰的方法

      调用特点 :
        在成员方法中可以直接可以直接调用成员,也可以直接调用静态内容
            只要静态的是本类中的可以省略类名直接调用,成员的调用默认省略的this.
        在静态方法中只能直接调用静态内容,不能直接调用成员内容,需要通过对象调用成员
 */
public class Class01_Static {
    //成员 : 类中方法外
    public int i = 1; //成员变量
    public static int j = 2; //静态变量 | 类变量

    //成员方法
    public void test(){
        System.out.println("成员方法");

        System.out.println(this.i);
        System.out.println(j);
    }

    //静态方法
    public static void  testStatic(){
        System.out.println("静态方法");

        System.out.println(j);
        System.out.println(new Class01_Static().i);
    }

    public static void main(String[] args) {
        //局部
        //通过类名调用
        System.out.println(Class01_Static.j);
        Class01_Static.testStatic();
        //通过对象调用
        Class01_Static cs = new Class01_Static();
        Class01_Static cs2 = new Class01_Static();
        System.out.println(cs.i);  //1
        System.out.println(cs.j);  //2
        System.out.println(cs2.j);  //2
        System.out.println(j); //如果调用本类中的静态内容,可以省略类名调用

        testStatic();
        Class01_Static.testStatic();
        cs.testStatic();

        cs.test();
    }
}
