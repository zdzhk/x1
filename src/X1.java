public class X1 {
    int x1Age;
   String name;
    //属性
    public X1(String name){
        System.out.println("X1的名字是"+name);
    }
public void setAge(int age){
        x1Age=age;
}
public int getAge(){
    System.out.println("x1 的年龄是"+x1Age+"岁");
    return x1Age;
}
    public static void main(String[] args) {
        X1 myX1=new X1("小熊");
        myX1.setAge(2);
        myX1.getAge();
        System.out.println("它有"+myX1.x1Age+"个兄弟姐妹");
    }
}
