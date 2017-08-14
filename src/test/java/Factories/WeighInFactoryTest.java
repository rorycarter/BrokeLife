package Factories;

import TheDomain.StudentInfo.WeighIn;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-08-14.
 */
public class WeighInFactoryTest {
    WeighIn weighIn;

    Map<Object, Double> weighInValues;
    @Before
    public void setUp() throws Exception {
        weighInValues = new HashMap<Object, Double>();
        weighInValues.put("weighNow", 111.00);
        weighInValues.put("desiredWeight", 85.00);

        weighIn = WeighInFactory.getWeighIn(weighInValues);

    }

    @Test
    public void getWeighIn() throws Exception {
        assertEquals(true,weighIn.equals(weighIn));
    }

}