//Chapter_05_14 (p.322)
interface Shape{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("---다시 그립니다. ");
        draw();
    }
}

class Circle implements Shape{
    private int r;
    Circle(int r){
        this.r=r;
    }

    @Override
    public void draw(){
        System.out.println("반지름이 "+r+"인 원입니다.");
    }

    @Override
    public double getArea(){
        return (r*r*PI);
    }
}

class Oval implements Shape{
    private int width;
    private int height;

    Oval(int width, int height){
        this.width=width;
        this.height= height;
    }

    @Override
    public void draw(){
        System.out.println(width + "x" + height + "에 내접하는 타원입니다.");
    }

    @Override
    public double getArea(){
        return ((width / 2 ) * (height / 2) * PI);
    }
}

class Rect implements Shape {
    private int width;
    private int height;

    Rect(int width, int height){
        this.width=width;
        this.height= height;
    }

    @Override
    public void draw(){
        System.out.println(width + "x" + height + "크기의 사각형입니다.");
    }

    @Override
    public double getArea(){
        return (width * height);
    }
}

public class ShapeImplements {
        public static void main(String[] args){
            Shape[] list = new Shape[3];
            list[0] = new Circle(10);
            list[1] = new Oval(20,30);
            list[2] = new Rect(10,40);

            for(int i = 0; i<list.length;i++) list[i].redraw();
            for(int i=0;i<list.length;i++) System.out.println("면적은"+list[i].getArea());
        }
}
