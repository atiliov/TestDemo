import org.testng.Assert;
import org.testng.annotations.Test;


public class TestMailG {

    @Test()
    public void testEmailGeneratorNoVaAFallar() {

        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generate();

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yoursite.com");

    }
    @Test()
    public void testEmailGeneratorFallara() {

        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = null;

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yoursite.com");

    }

    @Test()
    public void testEmailGeneratorFallaraDeNuevo() {

        RandomEmailGenerator obj = new RandomEmailGenerator();
        String email = obj.generate();

        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@NiEnPedo.com");

    }

}