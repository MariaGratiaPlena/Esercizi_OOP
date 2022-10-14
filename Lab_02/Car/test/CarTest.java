import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void testSolution() {
        Car testCar = new Car(0.05);
        car.addGas(10);
        Assert.assertEquals(10, testCar.getGas(), 0);
        car.drive(10);
        Assert.assertEquals(9.5, testCar.getGas(), 0);
    }
}