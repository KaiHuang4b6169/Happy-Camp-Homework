package model;

import model.Device.Device;
import model.Device.IPin;

import java.util.Iterator;
import java.util.Vector;

public class LogiSimulator {

    private Vector<Device> circuit;
    private Vector<Device> iPins;

    private Vector<Device> oPins;

    public LogiSimulator(){}

    public void setIPin(Vector<Device> iPins) {
        this.iPins = iPins;
    }

    public void setCircuit(Vector<Device> circuit) {
        this.circuit = circuit;
        this.checkOutputPin();
    }

    private void checkOutputPin(){
        for (Device device: circuit){
            if (!device.isConnected()){
                oPins.add(device);
            }
        }
    }

    public Vector<Device> getoPins() {
        return oPins;
    }

}
