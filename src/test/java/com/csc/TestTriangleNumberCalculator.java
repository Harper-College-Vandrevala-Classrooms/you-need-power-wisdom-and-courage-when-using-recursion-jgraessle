package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTriangleNumberCalculator {

  TriangleNumberCalculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new TriangleNumberCalculator();
  }

  @Test
  void TestValue1() {
    assertEquals(1, calculator.value(1));
  }
  @Test
  void TestValue2() {
    assertEquals(3, calculator.value(2));
  }
  @Test
  void TestValue4() {
    assertEquals(10, calculator.value(4));
  }
  @Test
  void TestAdd1N1() {
    assertEquals(2, calculator.add(1, 1));
  }
  @Test
  void TestAdd2N3() {
    assertEquals(9, calculator.add(2, 3));
  }
  @Test
  void TestAdd4N2() {
    assertEquals(13, calculator.add(4, 2));
  }
  @Test
  void TestSubract1N1() {
    assertEquals(0, calculator.subtract(1, 1));
  }
  @Test
  void TestSubtract2N3() {
    assertEquals(-3, calculator.subtract(2, 3));
  }
  @Test
  void TestSubtract4N2() {
    assertEquals(7, calculator.subtract(4, 2));
  }
  @Test
    void TestMultiply1N1() {
    assertEquals(0, calculator.multiply(1, 1));
  }
  @Test
  void TestMultiply2N3() {
    assertEquals(-3, calculator.multiply(2, 3));
  }
  @Test
  void TestMultiply4N2() {
    assertEquals(7, calculator.multiply(4, 2));
  }
  @Test
  void TestDivide1N1() {
  assertEquals(1, calculator.divide(1, 1));
  }
  @Test
  void TestDivide2N3() {
    assertEquals(0, calculator.divide(2, 3));
  }
  @Test
  void TestDivide4N2() {
    assertEquals(3, calculator.divide(4, 2));
  }
}
