public class Cake {
    //Test
    public static void main(String[] args) {
        Caker caker = new Caker("彭于晏", 4);
        Cake1 cake1 = new Cake1(8, 300, "圆形");
        cake1.show();
    }
}
    //蛋糕师
    class Caker {
        //属性
        public String name;
        public int level;

        //空构造
        public Caker() {
        }

        //带参数构造
        public Caker(String cakerName, int cakerLevel) {
            name = cakerName;
            level = cakerLevel;
        }

        //功能-制作蛋糕
        public Cake1 makeCake(int size,int price,String shape) {
            //创建一个蛋糕对象
            Cake1 cake1 = new Cake1(size,price,shape);
            return cake1;
        }

    }

    //蛋糕
    class Cake1 {
        //属性
        public int size;
        public int price;
        public String shape;

        //空构造
        public Cake1() {
        }
        //带参构造
        public Cake1(int cake1Size,int cake1Price,String cake1Shape){
            size=cake1Size;
            price=cake1Price;
            shape=cake1Shape;
        }
        //功能-展示
        public void show(){
            System.out.println(size+"-->"+shape+"-->"+price);
        }

    }
