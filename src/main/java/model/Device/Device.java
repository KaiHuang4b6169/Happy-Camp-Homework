package model.Device;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public abstract class Device {
    protected Vector<Device> iPins;

    public Device(){
        iPins = new Vector();
    }

    public void addInputPin(Device iPin){
        iPins.add(iPin);
    }

    public abstract Vector<Boolean> getValues();

    protected Vector<Boolean> getAllIPinValues(){
        Vector<Boolean> vector = new Vector();
        Iterator iterator = iPins.iterator();
        while(iterator.hasNext()){
            Vector<Boolean> deviceValues = ((Device) iterator.next()).getValues();
            vector.addAll(deviceValues);
        }
        return vector;
    }
}
