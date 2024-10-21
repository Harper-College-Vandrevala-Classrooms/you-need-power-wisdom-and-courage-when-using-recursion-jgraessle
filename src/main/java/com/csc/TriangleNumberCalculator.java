package com.csc;

public class TriangleNumberCalculator {
  int triangle = 0;
  int addTriangle = 0;
  int subTriangle = 0;
  public int value(int n) {
    if (n <=1) {
      return n;
    }
    return n + value(n-1);
  }  
  public int add(int n, int m) {
    int tri1 = value(n);
    int tri2 = value(m);
    return tri1 + tri2;
  }
  public int subtract(int n, int m) {
    int tri1 = value(n);
    int tri2 = value(m);
    return tri1 - tri2;
  }
  public static void main (String[] args) {
    TriangleNumberCalculator calculator = new TriangleNumberCalculator();
    System.out.println(calculator.value(13798));
    System.out.println(calculator.add(14200, 100));
    System.out.println(calculator.subtract(100, 100));
    
  }
}
