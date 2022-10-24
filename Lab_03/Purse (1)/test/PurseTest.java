import org.junit.Assert;
import org.junit.Test;

public class PurseTest {

    @Test
    public void findTest() {
    Purse purseTest = new Purse();
    purseTest.add(Purse.DOLLAR);
    Assert.assertTrue(purseTest.find(Purse.DOLLAR));
    }

    @Test
    public void countTest() {
        Purse purseTest = new Purse();
        purseTest.add(Purse.DOLLAR);
        Assert.assertEquals(1,purseTest.count(Purse.DOLLAR),0);
    }

    @Test
    public void minMaxTest() {
        Purse purseTest = new Purse();
        purseTest.add(Purse.DOLLAR);
        purseTest.add(Purse.CENT);
        purseTest.add(Purse.NICKEL);
        Assert.assertEquals(Purse.DOLLAR, purseTest.getMaximum());
        Assert.assertEquals(Purse.CENT, purseTest.getMinimum());
    }

    @Test
    public void getTotalTest() {
        Purse purseTest = new Purse();
        purseTest.add(Purse.DOLLAR);
        purseTest.add(Purse.DIME);
        purseTest.add(Purse.NICKEL);
        Assert.assertEquals(1.15,purseTest.getTotal(),0.001);
    }

    @Test
    public void addRemoveTest() {
        Purse purseTest = new Purse();
        purseTest.add(Purse.DOLLAR);
        Assert.assertTrue(purseTest.hasCoin(Purse.DOLLAR));
        purseTest.remove(Purse.DOLLAR);
        Assert.assertFalse(purseTest.hasCoin(Purse.DOLLAR));
    }

    @Test
    public void hasCoinTest() {
        Purse purseTest = new Purse();
        purseTest.add(Purse.DOLLAR);
        Assert.assertTrue(purseTest.hasCoin(Purse.DOLLAR));
        Assert.assertFalse(purseTest.hasCoin(Purse.DIME));
    }

    @Test
    public void toStringTest() {
        Purse purseTest = new Purse();
        purseTest.add(Purse.DOLLAR);
        Assert.assertEquals("Purse[Dollar = 1, Quarter = 0, Dime = 0, Nickel = 0, Cent = 0]", purseTest.toString());
    }

    @Test
    public void equalsTest() {
    Purse purseTest1 = new Purse();
    purseTest1.add(Purse.DOLLAR);
    Purse purseTest2 = new Purse();
    purseTest2.add(Purse.DOLLAR);
    Purse purseTest3 = new Purse();
    Assert.assertFalse(purseTest1.equals(purseTest3));
    Assert.assertTrue(purseTest1.equals(purseTest2));
    }
}