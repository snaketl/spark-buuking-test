package br.com.snk;

import com.beust.jcommander.JCommander;

/**
 *
 * @author SnK
 */
public class JCommanderLoadParameters implements LoadParameters {
    
    private final JCommander jCommander;

    public JCommanderLoadParameters() {
        jCommander = new JCommander();
    }

    @Override
    public Parameter load(Parameter parameter, String[] args) {
        jCommander.addObject(parameter);
        jCommander.parse(args);
        return parameter;
    }
    
}
