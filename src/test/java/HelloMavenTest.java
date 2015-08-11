import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.api.MuleEvent;
import org.mule.tck.junit4.FunctionalTestCase;


public class HelloMavenTest extends FunctionalTestCase {

	@Test
	public void sayHelloReturnsHelloMaven() throws Exception {
		runFlowAndExpect("sayHello", "Hello Maven");
	}
	
	@Test
	public void retrieveFlightsAddsAppropriateHeader() throws Exception {
		MuleEvent event = runFlow("retrieveFlights");
		String contentType = 
				event.getMessage().getOutboundProperty("Content-Type");
		assertEquals("application/json", contentType);
		
	}
	
	@Override
	protected String getConfigFile() {
		// TODO Auto-generated method stub
		return "maven-project.xml";
	}
	
}
