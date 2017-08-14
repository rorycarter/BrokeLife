package Repositories.Impl;

import Factories.WeighInFactory;
import Repositories.WeighInRepository;
import TheDomain.StudentInfo.WeighIn;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-08-14.
 */
public class WeighInRepositoryImplTest {
    Map<Object,Double> weighInValues;
    WeighIn weighIn;
    WeighInRepository weighInRepository;
    @Before
    public void setUp() throws Exception {
        weighInValues=new HashMap<Object,Double>();
        //weighInValues.put("screenId",weighIn.getScreenId());
        weighInValues.put("weighNow",111.00);
        weighInValues.put("desiredWeight", 88.00);
        weighInRepository=WeighInRepositoryImpl.getInstance();
    }

    @Test
    public void create() throws Exception {
        WeighIn weighIn= WeighInFactory.getWeighIn(weighInValues);
        weighInRepository.create(weighIn);
        assertEquals(88.00, weighIn.getWeightNow());
    }

    @Test
    public void read() throws Exception {
        WeighIn weighIn=weighInRepository.read("Carter11");
        assertEquals("weighNow", weighIn.getWeightNow());

    }

    @Test
    public void update() throws Exception {

        WeighIn weighIn = weighInRepository.read("1");
        WeighIn updateWeighIn = new WeighIn.Builder()
                .weighNow(weighInValues.get(111.00))
                .desiredWeight(weighInValues.get(88.00))
                .build();
        weighInRepository.update(updateWeighIn);
        weighIn = weighInRepository.read("Carter11");
        assertEquals(88.00, weighIn.getDesiredWeight());


    }

    @Test
    public void delete() throws Exception {
        weighInRepository.delete("Carter11");
        WeighIn weighIn = weighInRepository.read("Carter11");
        assertNull(weighIn);
    }

}