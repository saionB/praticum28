import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Square s = null;
    int size = 10;
    int which;

    // selection of Shape type wanted
    System.out.println("Select a shape:");
    System.out.println("1. Circle");
    System.out.println("2. Square");
    System.out.println("3. Triangle");

    which = scanner.nextInt();
    
    switch (which) {
      case 1: s = new Circle(); break;
      case 2: s = new Square(); break;
      case 3: s= new Triangle(); break;
      default: System.out.println("Invalid choice");
      scanner.close();
      return;
    }

    // method calls to the object in variable s
    // will behave properly based on the current
    // object type assigned to it
    System.out.println(s.area());
   }
}