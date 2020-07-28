package model.Device;

import java.util.List;
import java.util.Vector;

public abstract class Device {
    protected Vector<Device> iPins;

    public Device(){
        iPins = new Vector();
    }

    public void addInputPin(Device iPin){
        iPins.add(iPin);
    }

    public abstract Vector<Boolean> getValues();
}
