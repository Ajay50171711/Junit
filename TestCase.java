package testing;
import org.junit.Assert;
import org.junit.Test;


public class TestCase {
	@Test
	public void testPassword() {
		Program p = new Program();
		Assert.assertEquals("Anudip", p.checkUsername());
		Assert.assertEquals("JavaFullStack", p.checkPassword());
	}
}
