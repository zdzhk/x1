import java.sql.SQLOutput;

public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public static void main(String[] args) {
        Person p=new Person("张三",18);
        p.display();
    }
    public void display(){
        System.out.println("姓名:"+name);
        System.out.println("年龄:"+age);
    }
}
