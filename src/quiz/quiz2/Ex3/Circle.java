package quiz.quiz2.Ex3;

public class Circle extends Shape {
    private final double PI = 3.14159;
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return radius * radius * PI;
    }
}
