package api;

import models.Calc;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing Calculator")
class TestingCalculatorTest {

  private Calc calc;

  @BeforeEach
  void setUp() {
    calc = new Calc();
  }

  @Test
  @DisplayName("Multiplication of positive numbers")
  void testMultiplicationOfPositiveNumbers() {
    assertEquals(15, calc.testMultiply(5, 3), "5 * 3 should be 15");
  }
}