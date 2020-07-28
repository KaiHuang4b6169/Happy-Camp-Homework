package model.Device;

import java.util.Iterator;
import java.util.Vector;

public class GateAND extends Device {
    public GateAND(){
        super();
    }

    public Vector<Boolean> getValues() {
        Boolean value = true;
        Iterator iterator = this.getAllIPinValues().iterator();
        while(iterator.hasNext()){
            Object iPinValue = iterator.next();
            value = value && (Boolean) iPinValue;
        }

        Vector<Boolean> vector = new Vector();
        vector.add(value);
        return vector;
    }


}
