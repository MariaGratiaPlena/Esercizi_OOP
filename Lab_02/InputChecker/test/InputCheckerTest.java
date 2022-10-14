import org.junit.Assert;
import org.junit.Test;

public class InputCheckerTest {
    @Test
    public void YesTest() {
        InputChecker inputChecker = new InputChecker();
        Assert.assertEquals("OK", inputChecker.checkInput("S"));
        Assert.assertEquals("OK", inputChecker.checkInput("SI"));
        Assert.assertEquals("OK", inputChecker.checkInput("OK"));
        Assert.assertEquals("OK", inputChecker.checkInput("certo"));
        Assert.assertEquals("OK", inputChecker.checkInput("perché no?"));
    }

    @Test
    public void NoTest() {
        InputChecker inputChecker = new InputChecker();
        Assert.assertEquals("Fine", inputChecker.checkInput("N"));
        Assert.assertEquals("Fine", inputChecker.checkInput("NO"));
    }

    @Test
    public void DefaultTest() {
        InputChecker inputChecker = new InputChecker();
        Assert.assertEquals("Dato non corretto", inputChecker.checkInput("altro dato"));
    }
}