# Chapter07

Start Date: June 5, 2022
Status: 객체지향프로그래밍

### 00 Intro

제네릭(문법)과 컬렉션(라이브러리)

- 제네릭을 적용한 클래스/메소드를 작성하는 측면
- 제네릭이 적용된 클래스를 사용하는 측면만 다룸
- 

### 01 컬렉션의 개념

1. 컬렉션: 요소 객체들의 저장소
    1. 자료구조를 뜻함
    2. 자바에는 컬렉션이라는 인터페이스가 존재함 (java.util package)
    3.  자바에서 컬렉션이란, 컬렉션을 구현하는 클래스들을 통칭함
        - Map<K, V> : 자료구조(컬렉션)이나 컬렉션의 자식은 아님. 그 범주에 소속하긴 함(상속 구조는 따로)
        - 인터페이스: 추상적으로 정의한 자료구조
            - Set<E>: 순서 개념x, 중복 허용X
            - List<E>: 순서 개념O, 중복 허용O
            - Queue<E> : FIFO
        - 주의할 점
            - 
            - API문서를 확인할 때는 구현이 Array인지, LinkedList인지 확인해야 한다. →문제상황에 맞는 것을 골라 써야 한다.
            - 객체를 만들 땐 상위 인터페이스로 가리키는 습관 가질 것 `List l = new Vector();`

### 02 제네릭의 기본 개념 (간소)

1. JDK1.5에서 도입(2004년 기점)
    1. 자바는 하위호환성을 잘 유지 시켜준다. (<E>를 없이 사용해도 컴파일은 됨)
2. 모든 종류의 데이터 타입을 다룰수 있도록 일반화된 타입 매개 변수로 클래스나 메소드를 작성하는 기법 (C++의 템플릿과 동일)
3. 제네릭이 없을 때의 문제점
    1. 다른 타입이 들어가는 걸 막을 수 없음
    2. 나오는 요소는 무조건 강제 형 변환 해야 해서 귀찮음
    3. 불우하게 다른 타입이 들어가면 런타임 에러 발생
4. 제네릭
    1. <E> 는 어떤 타입으로 대체가 됨
        
        ```java
        Stack s = new Stack(); //원래
        Stack<Integer> s = new Stack<Integer>(); //제네릭 사용 시 이렇게 치환을 구체적으로 함
        ```
        
    2. 제네릭이 없을 때의 문제점들을 해결할 수 있음

### 03 컬렉션과 제네릭

1. 컬레션은 제네릭 기법으로 구현된다.
2. 컬렉션의 요소는 **객체**만 가능(레퍼런스 타입)
    1. 기본적으로  int, char ,double 등의 기본 타입은 사용 불가
    2. JDK1.5부터 **자동 박싱 / 언박싱로 기본타입 값을 객체로 자동 변환 (primitive type은 안됨)**
3. 제네릭
    1. 특정타입만 다루기 않고 여러 종류의 타입으로 변신할수 있도록 클래스, 메소드를 일반화 기시키는 기법
        - <E> <K> <V> // K : key , V :  value
    2. 예 : 제네릭 스택 `Stack<E>`
        - 정수만 다루는 스택 `Stack<Integer>` / 문자열만 다루는 스택 `Stack<String>`
    3. 제네릭이 도입되면 컴파일러가 사용하는 정보가 된다.
        - <Integer>를 하면 컴파일 타입에서 걸러져서 런타임에는 오류가 발생 안 함
        - 제네릭이라는 **정보는 프로그래머가 제공을 하고** **사용하는 것은 컴파일러이다.**
4. 왜 제네릭을 사용할까?
    1. 컴파일 시간에서 강한 타입 체크
    2. 캐스트 제거
    
    ```java
    List<String> list = new ArrayList<String>(); //Strong Typechecking
    list.add("hello");
    String s = list.get(0); //no cast
    ```
    

### 04 Vector <E>

1. 특성 
    1. java.util.Vector
        - <E>에서 E 대신 요소로 사용할 특정 타입으로 구체화
    2. 여러 객체들을 삽입, 삭제, 검사하는 컨테이너 클래스
        - 배열의 길이 제한 극복
        - 원소의 개수가 넘쳐 나면 자동 길이 조절
    3. 내부적 요소를 **배열 형태로 저장**
        - 객체, null
        - 기본 타입은 Wrapper객체로 만들어 저장
    4. Vector에서 객체 삽입
        - 벡터의 맨 뒤에 객체 추가
        - 벡터 중간에 객체 삽입
    5. Vector에서 객체 삭제
2. 활용
    
    ```java
    Vector<Integer> v = new Vector<Integer>(7); //벡터 생성
    
    v.add(5); //요소 삽입
    v.add(3);
    
    int n = v.size(); //n = 2
    int c = v.capacity(); // c = 7
    
    v.add(2,100); //중간 삽입: 인덱스 2번째에 100 삽입
    //주의할점. 중간 삽입에서 v.size()보다 큰 곳에 삽입 불가
    
    Integer obj = v.get(1); //요소 얻기1 
    int i = obj.intValue(); //요소 얻기2, 옛날 방식임이고 이젠 요소 3가능
    int i = v.get(1); //요소얻기 3 (자동언박싱)
    
    v.remove(1); //요소 삭제: 인덱스 1번째의 요소 삭제
    //v.remove(3); //컴파일 오류
    
    v.last = v.lastElement(); //마지막 요소값
    v.removeAllElements(); //모든 엘리먼트 삭제
    ```
    

### 05 컬렉션과 자동 언박싱

1. JDK1.5이전
    1. 기본 타입 데이터를 Wrapper클래스를 이용해 객체로 만들어 사용
    2. 컬렉션으로부터 요소를 얻어올 때 Wrapper 클래스로 캐스팅 필요
2. JDK1.5부터
    1. 자동 박싱 / 언박싱이 작동해 기본 타입 값 사용 가능함
        
        ```java
        Vector<Integer> v= new Vector<Integer>();
        v.add(4); // 4-> Integer.valueOF(4)로 자동 박싱됨
        int k = v.get(0); // Integer타입이 int 타입으로 자동 언박싱, k=4
        ```
        
    2. 제네릭 타입 매개변수를 기본타입으로 구체화할 수 없음
        
        `Vector<int> v = new Vector<int>(); //오류`
        

### 06 자바의 타입 추론 기능의 진화

1. Java7 이전: `Vector<Integer> v= new Vector<Integer>();`
2. Java7 이후: `Vector<Integer> v= new Vector<>();`
3. Java10 이후: var키워드 도입, 컴파일러의 지역 변수 타입 추론 가능
    
    `var v = new Vector<Integer>();`
    

### 07 ArrayList<E>

1. 특성
    1. 배열 기반
    2. **차이점: 벡터와 달리 스레드 동기화 기능 있음**
    3. 차이점 외에는 Vector<E>와 동일함

### 08 Iterator<E>

1. 컬렉션의 순차 검색을 위함
2. Vector<E>, ArrayList<E>, LinkedList<E>가 상속받는 인터페이스
    1. 리스트 구조의 컬렉션에서 요소의 순차 검색을 위한 메소드 포함
    2. 메소드들
        
        `boolean hasNExt()` 방문할 요소가 남아 있으면 ture 리턴
        
        `E next()` 다음 요소 리턴
        
        `void remove()` 마지막으로 리턴 된 요소 제거
        
3. iterator() 메소드 : Iterator 객체 반환
    
    ```java
    Vector<Integer> v = new Vector<Integer>(); //벡터 생성
    Iterator<Integer> it = v.iterator();
    while(it.hasNext(){ //모든 요소 방문
    	int n = it.next(); //다음 요소 리턴
    	...
    }
    ```
    
    - 리스트를 쓰는 경우, iterator는 굳이 필요 없다!
    

### 09 LinkedList<E>

1. 차이점: 내부가 LinkedList인것 말고는 다른 게 없다.

### 10 HashMap<K,V>

1. 특성
    1. java.util.HashMap
    2. 키와 값을 쌍으로 구성되는 요소를 다루는 컬렉션
        
        ```java
        HashMap<String, String>h = now HashMap<String, String>(); //해시맵 생성
        
        h.put("love","사랑"); //값 삽입
        h.put("apple","사과");
        
        String kor = h.get("love'); //키로 값 읽기
        
        h.remove("apple"); //키로 요소 삭제
        
        int n = h.size(); //요소개수 n = 1
        
        //iterating 하기
        Set<String> keys= java.Score.keySet();
        Iterator<String>it = keys.iterator(); 
        while(it.hsNext()){
        	String name = it.next();
        	int score = java.Score.get(name);
        	System.out.println(name+": "+"score");
        }
        ```
        
    

### 11 Collections 클래스 활용

1. Collections 클래스(Collection과 연관된 companion 클래스)
2. java.util패키지에 포함
3. 컬렉션 대해 연산 수행하고 결과로 컬렉션을 리턴
4. 모든 메소드가 static타입
5. 주요 메소드
    1. 컬렉션에 포함된 요소 소팅하는 메소드 `sort()`
    2. 요소 순서를 반대로 하는 메소드 `reverse()`
    3. 요소의 최대값, 최소값 찾아내는 메소드 `max(),` `min()`
    4. 특정 값을 검색하는 메소드 `binarySearch()`

## 컬렉션 보충자료

### 12 Enhanced for문의 사용

1. 사용법 : `for(초기화 : 배열) { ...}`
2. 장점
    1. 배열의 크기 조사할 필요 없음
    2. 반복문 본연의 반복문 구현에 집중하여 구현 가능
3. 단점
    1. 배열에서만 사용 가능, 배열의 값을 변경하지 못함
    
    ```java
    import java.util.Iterator;
    import java.util.LinkedList;
    import java.util.List;
    
    public class EnhancedForEx{
    	public static void main(String[] args){
    		List<String>list = new LinkedList<>();
    		list.add("Apple");
    		list.add("Orange");
    		list.add("Mango");
    		//아래처럼 해도 됨
    
    		for(int num = 0; num < list.size(); n++){
    			System.out.println(list.get(num));
    		} //일반적인 순회
    
    		for(String str:list){ //컴파일이 되면 아래 코드가 나오는 것임.
    			System.out.println(str);
    		} // 이렇게 간편하게 순회할 수 있음
          // public interface Collection<E> extends Iterable<E>인 것.
    		
    		for(Iterator<String>i = list.iterator(); i.hasNext();){
    			System.out.println(i.next());
    		} //이것도 가능
    	}
    }
    ```
    

### 13 `public interface Collection<E> extends Iterable<E>`

1. 표현:  Collection 인터페이스의 부모  Iterable<E>
2. API에서 previus 키워드가 붙은 것:  `ListIterator<E>`
    - `ListIterator<E> extends Iterator<E>` 이다.

### 14. `public static <T> List <T> asList(T...a)` 이해가 안된다…

1. asList는 fixed size
    1. 만들기는 쉬우나, add를 하면 Exception이 뜬다.
    2. 이것을 피하기 위해 객체를 만든다. 
    
    ```java
    List<String> list = Arrays.asList("Apple","Orange","Mango",Strawberry"); //고정사이즈
    list = new ArrayList<>(list);  //객체 만들어서 추가하려고함
    laist.add("Pear");
    ListIterator<String> list = list.listIterator();
    ```
    
2. `T…a` : 인자의 뜻이 가변이라는 문법 (`=T[]`)
    
    ```java
    import java.util.List;
    import 
    ```
    

### 15 interface Set<E>