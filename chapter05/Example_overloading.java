public class Example_overloading {
    protected String name; //protected. 사용되지 않았지만.. 이 접근지정자는 동일 패키지 또는 상속받은 경우 접근 가능
    public void paint(){
        draw(); // 3. public void draw(){...} 메소드 실행
    }
    public void draw(){
        System.out.println("Shape"); //4. Shape가 출력
    }
    public static void main(String args[]) {
        Example_overloading a = new Example_overloading(); //1. 레퍼런스타입의 a가 가리키고 있는 Shape 객체 생성
        a.paint(); //2. public void paint(){...} 메소드 실행
    }
}