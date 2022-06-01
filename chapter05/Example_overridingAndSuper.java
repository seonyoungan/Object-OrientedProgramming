class Shape{
    protected String name; //이 접근지정자는 동일 패키지 또는 상속받은 경우 접근 가능
    public void paint(){
        draw(); //3. draw();메소드 실행할 건데..동적바인딩으로 서브클래스의 draw(); 실행됨
    }
    public void draw(){
        System.out.println("Shape"); //7. 출력1: Shape
    }
}

public class Example_overridingAndSuper extends Shape {
    protected String name;
    @Override
    public void draw(){
        name = "Circle, hello"; // 4. name은 Circle로 선언
        super.name = "Shape"; //5. 수퍼클래스의 name Shape로 선언 (수퍼클래스의 접근지정자가 protected니까 접근 가능)
        super.draw(); //6. 수퍼클래스의 draw()메소드로..
        System.out.println(name); //8. 출력2: Circle, hello(4에서 선언한대로)
    }
    public static void main(String[] args){
        Shape b = new Example_overridingAndSuper(); //1. upcasting
        b.paint(); //2. 수퍼클래스로 이동하여 메소드 실행
    }
}