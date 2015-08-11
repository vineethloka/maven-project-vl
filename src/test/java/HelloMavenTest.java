import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;


public class HelloMavenTest extends FunctionalTestCase {

	@Test
	public void sayHelloReturnsHelloMaven() throws Exception {
		runFlowAndExpect("sayHello", "Hello Maven");
	}
	
	
	@Override
	protected String getConfigFile() {
		// TODO Auto-generated method stub
		return "maven-project.xml";
	}
	
}
