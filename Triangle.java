public class Triangle extends Shape {

    public Triangle(int size) {
      super(size);
    }
  
    public double area() {
      double height = (Math.sqrt(3) / 2) * getSize();
      double base = getSize();
      return (base * height) / 2;
    }
}