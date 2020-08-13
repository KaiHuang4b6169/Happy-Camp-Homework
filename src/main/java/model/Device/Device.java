package model.Device;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public abstract class Device {
    private boolean connected;
    protected Vector<Device> iPins;

    public Device(){
        iPins = new Vector();
        this.connected = true;
    }

    public void addInputPin(Device iPin){
        iPins.add(iPin);
        iPin.setConnected(true);
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

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }
}
