package model.Device;

import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Collectors;

public class GateNot extends Device {
    public GateNot(){
        super();
    }

    public Vector<Boolean> getValues(){
        return this.getAllIPinValues().stream()
                                .map(Boolean -> !Boolean)
                                .collect(Collectors.toCollection(Vector::new));
    }
}
