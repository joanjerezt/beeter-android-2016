package edu.upc.eetac.dsa.beeter.client;

import java.util.ArrayList;
import java.util.List;

import edu.upc.eetac.dsa.beeter.client.entity.Sting;

/**
 * Created by root on 25/12/15.
 */
public class BeeterRootAPI {

    private List<Sting> stings;

    public BeeterRootAPI() {
        stings = new ArrayList<>();
    }

    public List<Sting> getStings() {
        return stings;
    }

}