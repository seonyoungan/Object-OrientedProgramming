class Shape{
    protected String name; //protected. 사용되지 않았지만.. 이 접근지정자는 동일 패키지 또는 상속받은 경우 접근 가능
    public void paint(){
        draw(); //3. draw() 함수 실행
    } 
    
    public void draw(){
        System.out.println("Shape"); //실행안됨. 즉 틀이었던 셈.
    }
}

public class Example_overriding extends Shape {
    @Override
    public void draw(){
        System.out.println("Circle"); //4. 동적 바인딩에 의해 Circle이 출력됨.
    }
    public static void main(String args[]) {
        Shape b = new Example_overriding(); //1. upcasting 객체생성. b는 Circle객체를 가리키고 있음
        b.paint(); //2. 다형성 실현. super class로 이동
    }
}