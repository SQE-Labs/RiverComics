package utilities;

import org.testng.Assert;

public class Assertion {

    public static void assertEquals(String actual, String expected){
        Assert.assertEquals(actual,expected);
    }
    public static void assertTrue(boolean value) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(value);
    }
}