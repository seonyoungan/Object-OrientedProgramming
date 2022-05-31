//접근지정자
class Sample{
    public int a;
    private int b;
    int c; //default
}
public class Example_04_10 {
public static void main(String[] args){
    Sample testClass = new Sample();
    testClass.a = 10; //모든 곳에서 접근 가능
    //testClass.b = 10; //컴파일 오류(동일 클래스 아니면 접근 불가)
    testClass.c = 10; //같은 패키지에 속해있으므로 접근 가능
}
}
