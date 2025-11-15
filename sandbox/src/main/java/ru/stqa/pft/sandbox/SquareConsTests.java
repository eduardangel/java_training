package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareConsTests {

  @Test
  public void testArea(){
    SquareCons s = new SquareCons(5);
    Assert.assertEquals(s.area(), 25);
  }
}
