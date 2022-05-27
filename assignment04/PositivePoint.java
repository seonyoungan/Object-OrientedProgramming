//Chapter_05_08 (p.318)
class point{
    private int a;
    private int b;

    protected point(int a, int b){
        this.a = a;
        this.b = b;
    }

    protected int getA(){return a;}
    protected int getB(){return b;}
    protected void move(int a, int b){
        this.a = a;
        this.b = b;
    }
}
public class PositivePoint extends point {

    public PositivePoint() {
        super(0, 0);
    }
    public PositivePoint(int a, int b) {
        super(a, b);
        if (a < 0 || b < 0) {
            super.move(0, 0);
        }
    }
    @Override
    public String toString(){ //
        String message = "(" + getA() + "," + getB() + ")의 점";
        return message;
    }
    public static void main(String[] args){
            PositivePoint p = new PositivePoint();
            p.move(10,10);
            System.out.println(p.toString()+"입니다.");

            p.move(-5,5);
            System.out.println(p.toString()+"입니다.");
            PositivePoint p2 = new PositivePoint(-10,-10);

            System.out.println(p2.toString()+"입니다.");

        }
}
