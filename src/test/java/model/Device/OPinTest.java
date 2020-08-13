package model.Device;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OPinTest {
    @Test
    public void oPin_get_value_with_input_true_test(){
        IPin iPin = new IPin();
        Device oPin = new OPin();
        oPin.addInputPin(iPin);
        iPin.setValue(true);
        assertEquals(true, oPin.getValues().get(0));
    }
}
