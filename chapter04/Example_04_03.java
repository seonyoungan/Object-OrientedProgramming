public class Example_04_03 {
    int radius;
    String name;

    public Example_04_03(){
        radius = 1; name = ""; //radius 초기값 1, 이름 없음
    } //매개변수 없는 생성자

    public Example_04_03(int r, String n) {
        radius = r;
        name = n;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args){
        Example_04_03 pizza = new Example_04_03(10, "자바피자");
        double area = pizza.getArea();
        System.out.println(pizza.name+"의 면적은 "+ area);

        Example_04_03 donut = new Example_04_03(5, "자바도넛");
        area = donut.getArea();
        System.out.println(donut.name+"의 면적은 "+ area);
    }


}
