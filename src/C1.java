public class C1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "旺财";
        dog.type = "柴犬";
        dog.color = "黄色";
        dog.lookDoor();

        Dog dog2=new Dog(dog.color="白色", dog.name="拜拜");

        dog2.lookDoor();

        Dog dog3=new Dog( dog.name="风");

        dog3.lookDoor();

    }
}
   class Dog{
        String color;
        String name;
        String type;
        Dog(){
            System.out.println("空构造");
        }  //空构造
        public Dog(String dogName){
            System.out.println("一个参数构造");
            name=dogName;

        }
        public Dog(String dogColor,String dogName){
            System.out.println("两个参数构造");
            color=dogColor;
            name=dogName;
}

       public void lookDoor(){
           System.out.println(color+"的"+type+"正在看家..."+"它的名字叫"+name);
       }

   }







