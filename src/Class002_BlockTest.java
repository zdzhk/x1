//找到打印顺序+结果
//
public class Class002_BlockTest {
    public static int a = 0;

    {
        a = 10;
        System.out.println("3 、非静态代码块执行a=" + a); //
    }

    static {
        a = 6;
        System.out.println(" 1、静态代码块执行a=" + a); //
    }
    public Class002_BlockTest() {
        this(a); //

        System.out.println(" 6、"+a);  //
        System.out.println(" 7、无参构造方法执行a=" + a); //
    }
    public Class002_BlockTest(int n) {  //
        System.out.println("4 、"+n); //
        System.out.println(" 5、"+a);//
    }
    public static void main(String[] args) {
        System.out.println(" 2、main"); //
        Class002_BlockTest tsc = new Class002_BlockTest();

    }
}
