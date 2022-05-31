//circle 객체 배열 만들기
class Circle{
    int radius;
    public Circle(int radius){ //생성자
        this.radius = radius; //이 radius에는 매개변수를 대입한다. 이 radius가 뭔데? int radius
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}

public class Example_04_06 {
    public static void main(String[] agrs){
        Circle[] c; //Circle클래스타입의 배열을 선언, 배열 이름은 c
        c = new Circle[5]; //이 c는 5개의 인덱스를 가진 배열 객체

        for(int i=0;i<c.length;i++) //0~4까지 하나씩 증가시키며 반복
            c[i] = new Circle(i); //C[i]에 값을 하나씩 넣어준다. ??

        for(int i=0; i<c.length;i++) //0~4까지
            System.out.print((int)(c[i]).getArea()+" "); //각 배열마다 계산해서..출력 반복
    }

}