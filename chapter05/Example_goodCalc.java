abstract class Calculator{
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}

public class Example_goodCalc extends Calculator{
    @Override
    public int add(int a, int b){
        return a + b;
    }
    
    @Override
    public int subtract(int a, int b){
        return a - b;
    }
    
    @Override
    public double average(int []a ){
        double total = 0;
        for(int i =0;i<a.length;i++)
            total += a[i];
        return total / a.length;
    }
    
    public static void main(String[] args){
        Example_goodCalc c = new Example_goodCalc(); // c가 가리키고있다 GoodClac 객체 생성
        System.out.println(c.add(2,3));
        System.out.println(c.subtract(2,3));
        System.out.println(c.average(new int[] {2,3,4}));
        
    }
}