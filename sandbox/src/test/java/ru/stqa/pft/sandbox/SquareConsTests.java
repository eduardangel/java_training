package ru.stqa.pft.sandbox;


import org.junit.Assert;
import org.junit.Test;

public class SquareConsTests {

    @Test
    public void testArea() {
        SquareCons s = new SquareCons(5);
        Assert.assertEquals(25, s.area(),0);
    }
}
