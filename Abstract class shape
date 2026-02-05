abstract class Shape{
abstract double getarea();
abstract double getperimeter();
}
class Rectangle extends Shape {
double length;
double width;
Rectangle(double length, double width){
this.length = length;
this.width = width;
}
double getarea() {
return length * width;
}
double getperimeter() {
return 2 * (length + width);
}
}
class ShapeDemo {
public static void main(String[] args) {
Shape R1 = new Rectangle(4.6, 2.3); 
System.out.println("Area = " + 
R1.getarea());
System.out.println("Perimeter = " + 
R1.getperimeter());
}
}
