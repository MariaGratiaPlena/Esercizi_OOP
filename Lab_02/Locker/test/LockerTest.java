import org.junit.Assert;
import org.junit.Test;

public class LockerTest {
    @Test
    public void lockTest() {
        Locker locker = new Locker();
        Assert.assertTrue(locker.isOpen());
        locker.lock();
        Assert.assertFalse(locker.isOpen());
    }

    @Test
    public void successfulUnlockTest() {
        Locker locker = new Locker();
        locker.newComb("123");
        Assert.assertTrue(locker.isOpen());
        locker.lock();
        Assert.assertFalse(locker.isOpen());
        locker.unlock("123");
        Assert.assertTrue(locker.isOpen());
    }

    @Test
    public void unsuccessfulUnlockTest() {
        Locker locker = new Locker();
        locker.newComb("123");
        Assert.assertTrue(locker.isOpen());
        locker.lock();
        Assert.assertFalse(locker.isOpen());
        locker.unlock("000");
        Assert.assertFalse(locker.isOpen());
    }
}