package model.Device;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GateANDTest {
    @Test
    public void gateAND_get_value_with_all_input_true_test(){
        IPin iPin1 = new IPin();
        IPin iPin2 = new IPin();
        Device gateAND = new GateAND();
        gateAND.addInputPin(iPin1);
        gateAND.addInputPin(iPin2);

        iPin1.setValue(true);
        iPin2.setValue(true);
        assertEquals(true, gateAND.getValues().get(0));
    }

    @Test
    public void gateAND_get_value_with_all_input_false_test(){
        IPin iPin1 = new IPin();
        IPin iPin2 = new IPin();
        Device gateAND = new GateAND();
        gateAND.addInputPin(iPin1);
        gateAND.addInputPin(iPin2);

        iPin1.setValue(false);
        iPin2.setValue(false);
        assertEquals(false, gateAND.getValues().get(0));
    }

    @Test
    public void gateAND_get_value_with_different_value_input__test(){
        IPin iPin1 = new IPin();
        IPin iPin2 = new IPin();
        Device gateAND = new GateAND();
        gateAND.addInputPin(iPin1);
        gateAND.addInputPin(iPin2);

        iPin1.setValue(false);
        iPin2.setValue(true);
        assertEquals(false, gateAND.getValues().get(0));


        iPin1.setValue(true);
        iPin2.setValue(false);
        assertEquals(false, gateAND.getValues().get(0));
    }
}
