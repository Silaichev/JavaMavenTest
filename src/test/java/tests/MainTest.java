package tests;

import org.junit.Test;
import org.testng.Assert;

public class MainTest {

    @Test
    public void firstTest(){
        Assert.assertEquals("12", "12");
    }

    @Test
    public void secondTest(){
        Assert.assertEquals(12, 12);
    }

    @Test
    public void thirdTest(){
        Assert.assertEquals('a', 'a');
    }
}
