public class Circle {
    public int r;
    public Circle(int r){
        this.r=r;
    }
    public void getArea(){
        double area = Math.PI * r * r;//从Math工具类得到π的值
        System.out.println("圆的面积为："+area);
    }
    public void getPerimeter(){
        double zc = Math.PI * 2 * r;
        System.out.println("圆的周长为："+zc);
    }
}
