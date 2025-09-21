public class Circle {
    double radius;
    double area(){
        return 3.14*radius*radius;   
    }
    double perimeter(){
        return 2*3.14*radius;
    }
}

class CircleDemo{
    public static void main(String[] args) {
        double r = 5.6;
        Circle c = new Circle();
        c.radius = r;
        double a = c.area();
        double p = c.perimeter();
        System.out.println("area = " + a);
        System.out.println("perimeter = " + p);
    }
}


