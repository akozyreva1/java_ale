package ru.stqa.pft.run;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquestionTest {
    @Test
    public void test0(){
        Equestion e = new Equestion (2, 2, 2);
        Assert.assertEquals (e.rootNumber(),0);
    }

    @Test
    public void test1(){
        Equestion e= new Equestion (1,2,1);
        Assert.assertEquals (e.rootNumber(),1);
    }
    @Test
    public void test2(){
        Equestion e = new Equestion(1, 5, 6);
        Assert.assertEquals (e.rootNumber(),2);
    }
    @Test
    public void testLinear(){
        Equestion e = new Equestion (0, 1,1 );
        Assert.assertEquals (e.rootNumber(),1);
    }
    @Test
    public void testConstant(){
        Equestion e = new Equestion(0, 0, 1);
        Assert.assertEquals (e.rootNumber(),0);
    }
    @Test
    public void testZero(){
        Equestion e = new Equestion(0, 0, 0);
        Assert.assertEquals (e.rootNumber(),-1);
    }
}