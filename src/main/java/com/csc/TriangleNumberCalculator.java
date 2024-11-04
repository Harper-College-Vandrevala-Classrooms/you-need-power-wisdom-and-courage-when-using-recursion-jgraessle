package com.csc;

import java.util.ArrayList;

public class TriangleNumberCalculator {
  int triangle = 0;
  int addTriangle = 0;
  int subTriangle = 0;
  ArrayList<Integer> sequenceList = new ArrayList<>();
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
  // additional multiplication and division functions
  public int multiply(int n, int m) {
    int tri1 = value(n);
    int tri2 = value(m);
    return tri1 * tri2;
  }
  public int divide(int n, int m) {
    int tri1 = value(n);
    int tri2 = value(m);
    return tri1 / tri2;
  }
  public ArrayList<Integer> sequence(int n) {
    if (n <= 0) {
      return sequenceList;
    }
    else {
    sequenceList.add(0, value(n));
    n = n - 1;
    sequence(n);
    return sequenceList;
    }
  }
  public static void main (String[] args) {
    TriangleNumberCalculator calculator = new TriangleNumberCalculator();
    System.out.println(calculator.value(100));
    System.out.println(calculator.add(100, 100));
    System.out.println(calculator.subtract(100, 100));
    calculator.sequence(10);
    System.out.println(calculator.sequenceList);
  }
}
