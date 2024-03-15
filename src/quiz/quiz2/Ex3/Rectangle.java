package quiz.quiz2.Ex3;

public class Rectangle extends Shape{
    private double height;
    private double base;

    public Rectangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        return height * base;
    }
}
