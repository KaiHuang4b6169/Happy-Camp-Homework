package model.Device;

import java.util.Iterator;
import java.util.Vector;
import java.util.stream.Collectors;

public class GateNot extends Device {
    public GateNot(){
        super();
    }

    public Vector<Boolean> getValues(){
        Vector<Boolean> vector = new Vector();
        Iterator iterator = iPins.iterator();
        while(iterator.hasNext()){
            vector.addAll(getDeviceNotValues((Device) iterator.next()));
        }
        return vector;
    }

    private Vector<Boolean> getDeviceNotValues(Device device){
        return device.getValues().stream()
                .map(Boolean -> !Boolean)
                .collect(Collectors.toCollection(Vector::new));
    }
}
