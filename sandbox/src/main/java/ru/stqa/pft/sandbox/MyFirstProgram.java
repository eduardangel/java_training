package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main (String[] args) {

    hello("World");
    hello("user");
    hello("Eduard");

    double A = 8.0;
    double S = A * A;
    System.out.println("Площадь квадрата со стороной " + A + " = " + S);

    Square s = new Square();
    s.l = 5;
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + area(s));

    SquareCons sc = new SquareCons(10);
    System.out.println("Площадь квадрата со стороной " + sc.l + " = " + sc.area());

    Rectangle r = new Rectangle();
    r.a = 4;
    r.b = 6;
    System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + area(r));

    RectangleCons rc = new RectangleCons(20,30);
    System.out.println("Площадь прямоугольника со сторонами " + rc.a + " и " + rc.b + " = " + rc.area());

  }
  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }
  /*public static double area (SquareCons sc){
    return sc.l * sc.l;
  }*/
  public static double area(Square s){
    return s.l * s.l;
  }
  public static double area(Rectangle r){
    return r.a * r.b;
  }
  /*public static double area (RectangleCons rc){
    return rc.a * rc.b;
  }*/

}