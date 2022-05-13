import java.util.Scanner;
public class Chapter_04_06 {
    public static class Circle{
        private double x, y;
        private int radius;
        public Circle(double x, double y, int radius){
            this.x = x;
            this.y = y;
            this.radius = radius;
        }
        public void show(){
            System.out.println("가장 면적이 큰 원은 (" + x + "," + y + ")" + radius);
        }

        public double circleArea(){
            return (radius * radius * 3.14);
        }
    }
    public static class CircleManager{
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            double temp = 0;
            Circle[] c = new Circle[3];
            for(int i=0;i<c.length;i++){
                System.out.print("x, y, radius >>");
                double x = scanner.nextDouble();
                double y = scanner.nextDouble();
                int radius = scanner.nextInt();
                c[i] = new Circle(x, y, radius);
            }
            for(int i=0;i<c.length;i++){
                if(c[i].circleArea() > temp)
                    temp = c[i].circleArea();
            }
            for(int i=0;i<c.length;i++){
                if(temp == c[i].circleArea())
                    c[i].show();
            }
            scanner.close();
        }
    }
}
