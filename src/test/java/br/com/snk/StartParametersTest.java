package br.com.snk;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author SnK
 */
public class StartParametersTest {
    
    private LoadParameters loadParameters;
    
    @Before
    public void beforeTest() {
        loadParameters = new JCommanderLoadParameters();
    }

    @Test
    public void shouldLoadParameterPort() {
        StartParameters p = getParameters(getCommandLine());
        assertEquals(80, p.getPort());        
    }
    
    @Test
    public void shouldLoadParameterPortFromDefault() {
        StartParameters p = getParameters(getEmptyCommandLine());
        assertEquals(8080, p.getPort());        
    }

    private StartParameters getParameters(String[] args) {
        return (StartParameters) loadParameters.load(new StartParameters(), args);
    }
    
    private String[] getCommandLine() {
        return Arrays.asList("--port", "80").toArray(new String[0]);
    }

    private String[] getEmptyCommandLine() {
        return new String[0];
    }
    
}
