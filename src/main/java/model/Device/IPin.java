package model.Device;

import java.util.Vector;

public class IPin extends Device {
    private boolean value;

    public IPin(){
        super();
    };

    public void setValue(boolean value){
        this.value = value;
    }

    public Vector<Boolean> getValues(){
        Vector<Boolean> vector = new Vector();
        vector.add(value);
        return vector;
    }
}
