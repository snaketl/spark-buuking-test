package br.com.snk;

import com.beust.jcommander.Parameter;

/**
 * Parameters
 *
 * @author SnK
 */
public class StartParameters implements br.com.snk.Parameter {
    
    @Parameter(names = {"--port", "-p"}, description = "HTTP port number" )
    private int port = 8080;

    /**
     * Get HTTP port
     * 
     * @return HTTP port 
     */
    public int getPort() {
        return port;
    }
    
}
