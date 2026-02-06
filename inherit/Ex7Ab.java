abstract class Shape{
    String name;
    Shape(String name){
        System.out.println("Shape object is created");
        this.name = name;
    }
    abstract void calculateArea();
}

class Square extends Shape{
    double side;

    Square(String name, double side){
        super(name);
        this.side = side;
    }

    @Override
    void calculateArea(){
        System.out.println(this.name+" area = "+(this.side * this.side));
    }
}

abstract class Test{
    void test(){}
}

// abstract class Rectangle extends Shape{
class Rectangle extends Shape{
    double l, b;

    Rectangle(String name, double l, double b){
        super(name);
        this.l = l;
        this.b = b;
    }
    @Override
    void calculateArea(){
        System.out.println(this.name+ " area = "+(this.l * this.b));
    }
}

class Ex7Ab{
    public static void main(String[] args){
        // Square s = new Square("Square", 2);
        // s.calculateArea();

        // Rectangle r = new Rectangle("Rect", 3, 4);
        // r.calculateArea();

        Shape ob = new Square("Square", 2);
        ob.calculateArea();

        ob = new Rectangle("Rect", 3, 4);
        ob.calculateArea();
    }
}