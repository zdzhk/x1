/*
 旅行
涉及几种事物，创建几种类、
 1.国家
 属性：国家名字  位置  标志性酒店的名字
 2。秘书
 属性：姓名  性别 年龄
 功能：查攻略 订酒店  订机票

* */
public class Class03_Travel {
    public static void main(String[] args) {
        //创建国家对象
        class Country{
            //属性

            public String name;
            public String htel;
        }

//创建秘书对象
        class  Secretary{
            //属性
          public String name;
          public  boolean gender; //true=男性，false=女性
          public int age;
          //功能
            //1.订机票
      public void bookTickets(){System.out.println(name+"正在为你预定"+"countryName"+"的机票");
      }
      //2.订酒店
     public void bookHotel(String countryName,String hotelName){
         System.out.println(name+"正在我为你预定"+"countryName"+"的"+hotelName);

      }
        }
    }
}
