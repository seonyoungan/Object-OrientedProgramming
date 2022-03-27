public class Final {

    //field: field도 final을 사용할 수 있으나, 선언과 초기화 할당을 분류할 수 있다.
    public static final double PI_VALUE_STATIC;
    final double PI_VALUE;

    //Constructor: 함수와 유사하게 생겼지만, 리턴타입이 없는 함수이다.
    public Final(){
        PI_VALUE=3.14;
    }

    //Static Initialization Block: 나중에 배운다.
    static{
        PI_VALUE_STATIC = 3.14;
    }
    private static void main(String[] args){
        double PI;
        int radius = 1;
        PI = 3.14;

        double perimeter = 2 * PI * radius; // C는 가비지값에 연산을 해주나, Java는 그렇지 않다.

    }
}
