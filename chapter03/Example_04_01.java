import java.sql.SQLOutput;

public class Example_04_01 {
    int radius ; //반지름 필드
    String name;  // 원 이름 필드

    public Example_04_01(){} //원의 생성자

    public double getArea(){
        return 3.14 * radius * radius; //원의 면적 계산
    }

    public static void main(String[] args){
        Example_04_01 pizza;
        pizza = new Example_04_01(); //객체 생성
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name+"면적은 " + area);

        Example_04_01 donut = new Example_04_01();
        donut.radius = 2;
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name+"의 면적은 " + area);
    }

}
