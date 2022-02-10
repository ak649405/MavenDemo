package hu.training360.mavendemo.app;

import org.junit.Assert;
import org.junit.Test;

public class BasicUnitTest {



    @Test
    public void testHelloWorld(){

        String t = "Hello World!";

        Assert.assertEquals("Hello World!",t);
    }
}
