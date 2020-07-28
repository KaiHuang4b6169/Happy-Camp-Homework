package model.Device;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GateNotTest {
    @Test
    public void gateNot_get_value_with_input_true_test(){
        IPin iPin = new IPin();
        Device gateNot = new GateNot();
        gateNot.addInputPin(iPin);
        iPin.setValue(true);
        assertEquals(false, gateNot.getValues().get(0));
    }

    @Test
    public void gateNot_get_value_with_input_false_test(){
        IPin iPin = new IPin();
        Device gateNot = new GateNot();
        gateNot.addInputPin(iPin);
        iPin.setValue(false);
        assertEquals(true, gateNot.getValues().get(0));
    }

    @Test
    public void gateNot_get_value_with_multi_input_test(){
        IPin iPin1 = new IPin();
        IPin iPin2 = new IPin();
        Device gateNot = new GateNot();
        gateNot.addInputPin(iPin1);
        gateNot.addInputPin(iPin2);
        iPin1.setValue(false);
        iPin2.setValue(true);
        assertEquals(true, gateNot.getValues().get(0));
        assertEquals(false, gateNot.getValues().get(1));
    }
}
