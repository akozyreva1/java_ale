package ru.stqa.pft.run.point;

import org.testng.Assert;
import org.testng.annotations.Test;


public class PointTests {

    @Test

public void testdistance() {
        Pointi p1 = new Pointi(1.7777, 3);
        Pointi p2 = new Pointi(2.8888, 3);
            Assert.assertEquals(p2.distance(p1), 1.1110999999999998);
            Assert.assertEquals(p1.distance(p2), 1.1110999999999998);
}
    }
