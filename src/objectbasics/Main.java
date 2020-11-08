package objectbasics;

public class Main {

    // call-by-value demo
    // for primitives the value is passed
    // for reference types the value of the reference is passed
    private static void setRadius(double radius, Circle circle) {
        circle.radius = radius;
        radius = -1.0; // has no effect on circle.radius
        circle = null; // has no effect on the circle object outside this methodx
    }

    public static void main(String[] args) {
        Circle c1 = new Circle(10, 20, 100);
        System.out.println("c1 = " + c1); // c1 = Circle{x=10.0, y=20.0, radius=100.0}
        setRadius(50, c1);
        System.out.println("c1 = " + c1); // c1 = Circle{x=10.0, y=20.0, radius=50.0}

        Circle c2 = c1;
        System.out.println("c1 = " + c1); // c1 = Circle{x=10.0, y=20.0, radius=50.0}
        System.out.println("c2 = " + c2); // c2 = Circle{x=10.0, y=20.0, radius=50.0}
        c2.radius = 250; // also sets for c1, as c2 is just a reference to c1
        System.out.println("c1 = " + c1); // c1 = Circle{x=10.0, y=20.0, radius=250.0}
        System.out.println("c2 = " + c2); // c2 = Circle{x=10.0, y=20.0, radius=250.0}
    }

}
