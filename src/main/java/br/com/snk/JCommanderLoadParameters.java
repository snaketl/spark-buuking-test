package br.com.snk;

import com.beust.jcommander.JCommander;

/**
 *
 * @author SnK
 */
public class JCommanderLoadParameters implements LoadParameters {

    @Override
    public Parameter load(Parameter parameter, String[] args) {
        JCommander jCommander = new JCommander(parameter, args);
        return parameter;
    }
    
}
