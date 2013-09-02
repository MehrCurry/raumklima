package de.gzockoll.osgi.raumklima;

import org.apache.camel.test.blueprint.CamelBlueprintTestSupport;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: guido
 * Date: 19.08.13
 * Time: 18:06
 * To change this template use File | Settings | File Templates.
 */
public class RouteTest extends CamelBlueprintTestSupport {

    @Override
    protected String getBlueprintDescriptor() {
        return "OSGI-INF/blueprint/blueprint.xml";
    }

    @Test
    public void testRoute() throws Exception {

        // set mock expectations
        getMockEndpoint("mock:result").expectedMinimumMessageCount(0);

        Thread.sleep(3000);
        // send a message
        // template.sendBody("direct:start", "World");

        // assert mocks
        assertMockEndpointsSatisfied();
    }
}
