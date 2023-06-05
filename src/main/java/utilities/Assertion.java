package utilities;

import org.testng.Assert;

public class Assertion {

    public static void assertEquals(String actual, String expected) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(actual,expected);
    }
    public static void assertTrue(boolean value) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(value);
    }
}