public class X2 {
    String name;
    int age;
    String designation;
    double salary;
    //X2构造器
    public X2(String name){
        this.name=name;
    }
    //设置age的值
    public void x2Age(int x2Age){
        age=x2Age;
    }
    //设置designation的值
    public void x2Designation(String x2Desig){
        designation=x2Desig;
    }
    //设置salary的值
    public void x2Salary(double x2Salary){
        salary=x2Salary;
    }
    //打印信息
   public void printX2(){
       System.out.println("Name:"+name);
       System.out.println("Age:"+age);
       System.out.println("Designation:"+designation);
       System.out.println("salary:"+salary);
    }
}
