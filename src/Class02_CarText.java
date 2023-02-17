/*
    手机测试类 :
        1.导包 import 包名.类名;
            不需要导包的类型 :
                         1.java.lang包下的
                         2.同包下的类
        2.创建类型的引用|变量 : 通过new关键字创建对象
            数据类型 引用名|变量名 = new 数据类型();

        3.使用对象的成员(属性,功能)
            对象.属性名
            对象.功能名(实参)


    注意 :
        基本数据类型就是数据值 123  'a'  false  1.1
        引用数据类型的数据就是对象数据
        成员是属于对象的,必须跟随对象进行使用
 */
public class Class02_CarText {
    public static void main(String[] args){
        //创建汽车对象
        Class01_Car c1=new Class01_Car();
        c1.brand="大众";
        c1.color="白色";
        c1.price="3500";
    }
}
