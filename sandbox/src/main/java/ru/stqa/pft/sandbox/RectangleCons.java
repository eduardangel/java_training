package ru.stqa.pft.sandbox;

public class RectangleCons {
  public double a;
  public double b;

  public RectangleCons(double a, double b){
    this.a = a;
    this.b = b;
  }
  public double area (){
    return this.a * this.b;
  }
}
