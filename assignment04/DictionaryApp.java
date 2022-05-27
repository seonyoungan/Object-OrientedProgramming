//Chapter_05_10 (p.319)

abstract class PairMap{
    protected String keyArray []; //key들을 저장하는 배열
    protected String valueArray []; //value들을 저장하는 배열
    abstract String get(String Key); //key 값을 가진 value 리턴, 없으면 null 리턴
    abstract void put(String key, String value); //key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정
    abstract String delete(String key); //key값을 가진 아이템(value와 함께) 삭제. 삭제된 value 값 리턴
    abstract int length(); //현재 저장된 아이템 개수를 리턴
}

class Dictionary extends PairMap{
    private int size;
    public Dictionary(int size){
        super.keyArray = new String[10];
        super.valueArray = new String[10];
        this.size = size;
    }

    @Override
    protected String get(String key) {
        for (int i = 0; i < this.size; i++) {
            if (key.equals(super.keyArray[i])) { //super class의 배열의 값과 매개변수 key값이 일치하면
                return (super.valueArray[i]); //keyArray[i] 값 return
            }
        }
        return null; //for문이 종료된 후 null return
    }

    @Override
    protected void put(String key, String value){
        int i;
        for(i=0; i<this.size;i++){
            if(key.equals(super.keyArray[i])){
                super.valueArray[i] = value; //매개변수 value를 인덱스에 넣음
                break;
            }
            else if(super.keyArray[i]==null) {
                super.keyArray[i]=key;
                super.valueArray[i]=value;
                break;
            }
        }
    }

    @Override
    protected String delete(String key){
        String del_value = null;
        for(int i=0;i<this.size;i++){
            if(key.equals(super.keyArray[i])){ //key값이 keyArray[i]값과 일치하면
                del_value = super.valueArray[i]; //그 값을 del_value 변수에 대입
                super.keyArray[i] = null;  // null값을 keyArray[i]값에 대입
                super.valueArray[i] = null;  // null값을 valueArray[i]값에 대입
                break;
            }
        }
        return del_value; //del_value값 반환
    }


    @Override
    protected int length(){
        int item = 0;
        for(int i=0;i<this.size;i++){
            if(super.keyArray[i] != null){
                item++;
            }
        }
        return item;
    }
}

public class DictionaryApp {
    public static void main(String[] args){
        Dictionary dic = new Dictionary(10);
        dic.put("황기태", "자바");
        dic.put("이재문", "파이썬");
        dic.put("이재문", "c++");
        System.out.println("이재문의 값은 "+dic.get("이재문"));
        System.out.println("황기태의 값은 "+dic.get("황기태"));
        dic.delete("황기태");
        System.out.println("이재문의 값은 "+dic.get("황기태"));
    }
}
