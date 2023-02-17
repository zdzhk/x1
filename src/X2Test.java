public class X2Test {
    public static void main(String[] args) {
        //使用构造器创建两个对象
        X2 x2One=new X2("jjj");
        X2 x2Tw0=new X2("yyy");

        //调用这两个对象的成员方法
        x2One.x2Age(26);
        x2One.x2Designation("Senio Software Engineer");
        x2One.x2Salary(1000);
        x2One.printX2();

        x2Tw0.x2Age(26);
        x2Tw0.x2Designation("Senio Software Engineer");
        x2Tw0.x2Salary(10000);
        x2Tw0.printX2();
    }
}
