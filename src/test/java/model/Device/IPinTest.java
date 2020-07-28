package model.Device;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IPinTest {
    @Test
    public void iPin_set_value_test(){
        IPin ipinTrue = new IPin();
        IPin ipinFalse = new IPin();
        ipinTrue.setValue(true);
        ipinFalse.setValue(false);
        assertEquals(true, ipinTrue.getValues().get(0));
        assertEquals(false, ipinFalse.getValues().get(0));
    }
}
