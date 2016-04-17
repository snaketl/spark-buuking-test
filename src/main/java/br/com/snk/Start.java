package br.com.snk;

import static spark.Spark.*;

/**
 * Start the application
 * 
 * @author SnK
 */
public class Start {
    
    /**
     * Start the application
     * 
     * @param args 
     */
    public static void main(String[] args) {
        StartParameters parameters = loadParametersFromCommandLine(args);
        configServer(parameters);
    }
    
    /**
     * Configure server
     * 
     * @param parameters Parameters
     */
    private static void configServer(StartParameters parameters) {
        port(parameters.getPort());                
        
        
    }
    
    /**
     * Load parameters from command line
     * 
     * @param args
     * @return StartParameters
     */
    private static StartParameters loadParametersFromCommandLine(String[] args) {
        JCommanderLoadParameters loadParameters = new JCommanderLoadParameters();
        return (StartParameters) loadParameters.load(new StartParameters(), args);
    }
    
}
