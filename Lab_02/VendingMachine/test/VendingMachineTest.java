import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {
    @Test
    public void newMachineTest(){
        VendingMachine testMachine= new VendingMachine();
        Assert.assertEquals(0,testMachine.getNumberOfTokens(),0);
    }
    @Test
    public void addAndTakeCanTest(){
      VendingMachine testMachine = new VendingMachine();
      testMachine.addCans(20);
      testMachine.takeCan();
      Assert.assertEquals(19, testMachine.getNumberOfCans(), 0);
  }
  @Test
  public void TakeTokensTest(){
      VendingMachine testMachine = new VendingMachine(20);
      testMachine.takeCan();
      Assert.assertEquals(1, testMachine.getNumberOfTokens(),0);
  }
}