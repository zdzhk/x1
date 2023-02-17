//输出答案
public class Class002_StaticTest {
    public static int id;
    public int age;
    public static void main(String[] args) {
        Class002_StaticTest class002_StaticTest = new Class002_StaticTest();  //

        System.out.println(Class002_StaticTest.id);   //
        System.out.println(class002_StaticTest.age);   //

        class002_StaticTest.change(); //   ///
        System.out.println(Class002_StaticTest.id); //
        System.out.println(class002_StaticTest.id);  //
        System.out.println(class002_StaticTest.age);  //age=
        class002_StaticTest.change();  //   //
        System.out.println(id);  //
        System.out.println(class002_StaticTest.age);  //
    }
    public void change() {
        Class002_StaticTest class002_StaticTest = new Class002_StaticTest(); //
        class002_StaticTest.age++;  //
        Class002_StaticTest.id++;  //
        System.out.println("In change(): id = " + id + " age = " + age);  //id=   age=   //
        System.out.println("In change(): id = " + id + " Class002_StaticTest.age = " + class002_StaticTest.age);
        //id= Class002_StaticTest.age=   //
    }
}
