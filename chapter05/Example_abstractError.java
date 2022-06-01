abstract class Shape{};

public class Example_abstractError{
    public static void main(String[] args){
        Shape shape;
        shape = new Shape(); //컴파일오류가 난다. 추상클래스는... 객체를 생성할 수 없으므로...
    }
}