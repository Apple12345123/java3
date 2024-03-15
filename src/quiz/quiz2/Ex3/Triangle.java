package quiz.quiz2.Ex3;

public class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }


    @Override
    double area() {
        return height*base*0.5;
    }
}
