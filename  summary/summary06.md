# Chapter06

Start Date: June 5, 2022
Status: 객체지향프로그래밍

### 01 주요패키지

### 02 Object 클래스

1. 특징
    1. java.lang 패키지에 포함됨 (모든 클래스의 수퍼 클래스)
        1. 모든 객체는 object에 정의된 메소드를 갖고 있음
        2. `obj.getClass()` 처럼  호출 가능 (컴파일 에러가 아님)
    2. Object 클래스로 객체 속성 알아내기
        
        ```java
        class Point{
        	private int x, y;
        	public Point(int x, int y){
        		this.x = x; this.y = y;
        	}
        }
        
        public class ObjectPropertyEx{
        	public static void print(Object obj){
        		System.out.println(obj.getClass().getname); //클래스 이름 출력됨, 출력: Point
        		System.out.println(obj.hashCode()); // 해시코드 값이 출력됨, 출력: 3122313
        		System.out.println(obj.toString()); // 객체를 문자열로 만들어서 출력, 출력: Point@3122313
        		System.out.println(obj); /*객체 출력, 출력: Point@3122313
        		obj를 toString화해서 출력해주기 때문에.. 결국 obj.toString()과 같은 것이다.*/
        	}
        	public static void main(String[] args){
        	Point p = new Point(2,3);
        	print(p);
        }
        ```
        
    3. **String toString과 boolean equals(Object obj)**
        - **오버라이딩 해라**
        - **이 목적에 해당하는 함수를 만들 때는 이름을 짓지 말고 이 이름들로 해라**
        
        ![Untitled](Chapter06%201cae47341d774e0d8b3a1dcca070973d/Untitled.png)
        
        - 객체 비교와 equals()
            - == 연산자 : if문에서 java에서는 거의 사용하지 않음.
            - bollean equals(Object obj)를 미리 만들어놔라
        - Point 객체를 문자열로 리턴하는 toString()작성
            - 의도한 바가 있는 함수들은 오버라이드 해라.
            
            ```java
            class Point{
            	private int x, y;
            	public Point(int x, int y){
            		this.x = x; this.y = y;
            	}
            	public String toString(){ //오버라이드 해야지댕..
            		return "Point("+x+","+y+")";
            	}
            }
            
            public class ToString{
            	public static void print(Object obj){
            		Point p = new Point(2,3);
            		System.out.println(p); //질문..
            		//이것도 obj를 toString화해서 출력해주기 때문에.. 결국 obj.toString()과 같은 것이다.*아닌가?
            		System.out.println(p.toString());
            		System.out.println(p); //p는 toString()으로 자동 변환
            		System.out.println(p+"입니다."); //p.toString() + "입니다"로 자동 변환
            	}
            }
            ```
            

### 03 Wrapper 클래스

1. 자바의 기본 타입을 클래스화한 8개의 클래스
    1. 이름이 Wrapper인 클래스는 존재하지 않음
    2. 용도: 기본 타입의 값을 객체로 다룰 수 있게 함
        
        
        | 기본 타입 | byte | short | int | long | char | float | double | boolean |
        | --- | --- | --- | --- | --- | --- | --- | --- | --- |
        | Wrapper 클래스 | Byte | Short | Int | Long | Char | Float | Double | Boolean |
    3. 기본 타입 값으로 Wrapper 객체 생성
        
        ```java
        Integer i = Integer.valueOf(10);
        Double d = Double.valueOf(3.14);
        ```
        
    4. 문자열로 Wrapper 객체 생성
        - 주로 파일, 네트워크를 원데이터 타입으로 바꿔야할 때가 있는데. .그때 이용함
            
            ```java
            Integer i = Integer.valueOf("10"); //int(10)
            Double d = Double.valueOf("3.14"); // double(3.14)
            ```
            
    5. 자바 9부터는 생성자 이용한 Wrapper객체 생성은 폐기
        
        `static int parseInt(String s, int radix)`  문자열 s를 지정된 진법의 정수로 변환한 값 리턴 (API문서로 활용들을 확인해 봐라)
        

### 04 박싱과 언박싱

1. 박싱: 기본타입을 wrapper안으로 들어가도록 하는 것(객체로 변환)
2. 언박싱 : wrapper 객체에 들어가 있는 기본 타입 값을 빼냄
3. auto박싱, auto언박싱 (JDK1.5~)
    
    ```java
    Integer ten = 10; //자동 언박싱, Integer ten = Integer.valueOf(10);으로 자동 처리
    int n = ten; // 자동 언박싱, int n = ten.intValue();로 자동 처리
    ```
    

### 05 String 특징과 객체 생성

1. String : java.lang.String
    1. String클래스는 하나의 문자열 표현
    2. String생성자
        
        ```java
        String() //빈 스트링 객체 생성
        String(char[] value) // char배열에 있는 문자들을 스트링 객체로 생성
        String(String original) //매개변수로 주어진 문자열과 동일한 스트링 객체 생성
        String(StringBuffer buffer) //매개변수로 주워진 스트링 버퍼의 문자열을 스트링 객체로 생성
        ```
        
    3.  스트링 생성방법
        - 리터럴로 생성: JVM이 리터럴 관리, 응용 프로그램 내 공유 `String s = “Hello”;`
            - s가 Hello객체를 가리킴(동일한 게 있으면 동일한 걸 같이 가리킴)
        - 객체로 생성: 힙메모리에 String 객체 생성 `String t = new String(”HELLO”);`
            
            ![Untitled](Chapter06%201cae47341d774e0d8b3a1dcca070973d/Untitled%201.png)
            
        - String객체는 수정 불가 (immutable)
            
            ```java
            String s = new String("Hello");
            String t = s.ocncat("Java"); //스트링 s에 Java를 덧붙인 새 스트링 객체 리턴
            ```
            
        - 스트링 비교시 반드시 equals()를 사용할 것
            - equals() : 내용을 비교 (equality, equivalency 비교)
            - ==연산자: 문자열 비교에 사용하면 안됨 (identify 식별)
    4. 주요 메소드
        
        ![Untitled](Chapter06%201cae47341d774e0d8b3a1dcca070973d/Untitled%202.png)
        
    

### 06 StringBuffer 메소드 활용 예

1. StringBuffer 메소드: **mutable string** / java.lang에 존재
    1. **문자열 변경** 가능 (↔ String Class)
    2. 버퍼가 모자라서 에러가 나는 경우는 없음
    3. **객체의 크기**는 스트링 길이에 따라 **가변적**이다.
        
        `StringBuffer sb = new StringBuffer(”java”);`
        
        ![Untitled](Chapter06%201cae47341d774e0d8b3a1dcca070973d/Untitled%203.png)
        
    4. 장점
        - 메모리를 아낄 수 있음
        - 문자열 조작 많으면 `StringBuffer`를 사용하고 마지막에 `toString`으로 호출하여도 됨
    5. null문자: 자바에서 아무 의미가 없다.
2. StringBuilder 메소드: **mutable String** / java.lang에 존재
    1. **StringBuffer와 차이점: 동기화 보장이 안됨 (StringBuffer: 동기화가 됨)** 
        - Thread의 개념이 없으므로 엉망징창 결과가 나올 수 있음
        - **Single Thread**인 경우에만 사용하는 게 좋음

### 07 StringTokenizer 클래스

1. java.util.StringTokenizer
    1. 하나의 문자열을 여러 문자열로 분리
        - 문자열을 분리할 때 사용되는 기준 문자 : **구분 문자인 &**
    2. 토큰 : 구분 문자로 분리된 문자열
    
    ```java
    import java.util.StringTokenizer;
    
    public class StringTokenizerEx{
    	public static void main(String[] args){
    		StringTokenizer st = new StringTokenizer("홍길동/장화/홍련/콩쥐/팥쥐","/");
    		while(st.hasMoreTokens()){
    			System.out.println(st.nextToken()); //출력: 홍길동\n장화\n홍련\n\콩쥐\n팥쥐
    		}
    	}
    }
    ```
    

1. String 클래스의 split()메소드를 이용해 구현 가능
    1. 문자열 패턴임 `String[] split(String regex)`
        - 정규식 regex에 일치하는 부분을 중심으로 스트링을 분리하고 분리된 스트링들을 배열로 저장해 리턴함