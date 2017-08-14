package Services.Impl;

import Factories.WeighInFactory;
import Repositories.Impl.WeighInRepositoryImpl;
import Repositories.WeighInRepository;
import Services.WeighInService;
import TheDomain.StudentInfo.WeighIn;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by Rory on 2017-08-14.
 */
public class WeighInServiceImplTest {
    Map<Object,Double> weighInValues;
    WeighIn weighIn;
    WeighInService weighInService;
    @Before
    public void setUp() throws Exception {
        weighInValues=new HashMap<Object,Double>();
        //weighInValues.put("screenId",weighIn.getScreenId());
        weighInValues.put("weighNow",111.00);
        weighInValues.put("desiredWeight", 88.00);
        weighInService= WeighInServiceImpl.getInstance();
    }

    @Test
    public void create() throws Exception {
        WeighIn weighIn= WeighInFactory.getWeighIn(weighInValues);
        weighInService.create(weighIn);
        assertEquals(88.00, weighIn.getWeightNow());
    }

    @Test
    public void read() throws Exception {
        WeighIn weighIn=weighInService.read("Carter11");
        assertEquals("weighNow", weighIn.getWeightNow());

    }

    @Test
    public void update() throws Exception {

        WeighIn weighIn = weighInService.read("1");
        WeighIn updateWeighIn = new WeighIn.Builder()
                .weighNow(weighInValues.get(111.00))
                .desiredWeight(weighInValues.get(88.00))
                .build();
        weighInService.update(updateWeighIn);
        weighIn = weighInService.read("Carter11");
        assertEquals(88.00, weighIn.getDesiredWeight());


    }

    @Test
    public void delete() throws Exception {
        weighInService.delete("Carter11");
        WeighIn weighIn = weighInService.read("Carter11");
        assertNull(weighIn);
    }
}