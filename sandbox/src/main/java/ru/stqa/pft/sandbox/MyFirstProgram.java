package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main (String[] args) {

    hello("World");
    hello("user");
    hello("Eduard");

    double a = 8.0;
    double s = a * a;
    System.out.println("Площадь квадрата со стороной " + a + " = " + s);

    double l = 5;
    System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

    double x = 4;
    double y = 6;
    System.out.println("Площадь прямоугольника со сторонами " + x + " и " + y + " = " + area(x, y));

  }
  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + "!");
  }
  public static double area(double len){
    return len*len;
  }
  public static double area(double a, double b){
    return a * b;
  }

}