public abstract class Shape {
    int a;
    public abstract String toString();
}
class Circle extends Shape{
    double r;
    double S(){
        return Math.PI * r * r;
    }

    public String toString() {
        return "Circle{" +
                "r=" + r +
                "a= " +a +
                '}';
    }
}
class Rectangle extends Shape{
    int b;

    public String toString() {
        return "Rectangle{" +
                "b=" + b +"a= " +a+
                '}';
    }
}
class Square extends Shape{
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }
}
/*@startuml
abstract class shape{
  int a;
{abstract} String toString();
}

class Rectangle extends shape{
    int b;
    public String toString();
}

class Square extends shape{
    public String toString();
}


class Circle extends shape{
    double r;
    double S();
    public String toString();
}

Circle<|-- SmallCircle
Circle<|-- BigCircle
Rectangle<|--SmallRectangle
Rectangle<|--BigRectangle
Square<|--SmallSquare
Square<|--BigSquare
@enduml*/