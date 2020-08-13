package model.Device;

import java.util.Vector;

public class OPin extends Device {

    public OPin(){
        super();
    }

    @Override
    public Vector<Boolean> getValues() {
        return iPins.lastElement().getValues();
    }
}
