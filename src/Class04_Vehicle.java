public class Class04_Vehicle {
    //属性
   int size;
   int speed;
    public static void main(String[] args) {
        //创建交通工具对象
        Class04_Vehicle ve = new Class04_Vehicle();
        ve.setSize(10);//设置初始体积
        ve.setSpeed(30);//设置初始速度
        ve.move();//调用移动方法
        ve.speedUp();//给交通工具减速
        ve.speedDown();//加速
    }
          //功能
          //移动
          public void move() {
              System.out.println("行进中......，速度 "+speed+"km/h" );
          }
          //设置速度
          public void setSpeed(int speed) {
              this.speed = speed;
              System.out.println("初始速度设置为:"+speed+" km");
          }
          //加速
          public void speedUp(){
              this.speed+=20;
              System.out.println("速度增加20后为:"+speed+" km");
          }
          //减速
          public void speedDown(){
              this.speed-=10;
              System.out.println("减速10后为:"+speed+" km");
          }
          //设置体积
          public void setSize(int size){
              this.size=size;
              System.out.println("初始体积设置为:"+size+" m^3");
          }

        }

