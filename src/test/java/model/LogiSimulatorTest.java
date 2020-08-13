package model;

import model.Device.*;
import org.junit.Test;

import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class LogiSimulatorTest {
    @Test
    public void getSimulationResultTest(){
        LogiSimulator logiSimulator = new LogiSimulator();
        Vector<Device> iPins = new Vector();
        Vector<Device> circuit = new Vector(3);

        for (int i=0; i<3; i++){
            iPins.add(i, new IPin());
        }

        circuit.add(0, new GateAND());
        circuit.get(0).addInputPin(iPins.get(0));
1        circuit.get(0).addInputPin(circuit.get(1));
        circuit.get(0).addInputPin(circuit.get(2));

        circuit.set(1, new GateNot());
        circuit.get(1).addInputPin(iPins.get(1));

        circuit.set(2, new GateOR());
        circuit.get(2).addInputPin(circuit.get(1));
        circuit.get(2).addInputPin(iPins.get(2));

        logiSimulator.setIPin(iPins);
        logiSimulator.setCircuit(circuit);

        assertEquals(1, logiSimulator.getoPins());
    }
}
