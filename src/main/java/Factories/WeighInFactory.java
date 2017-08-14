package Factories;

import TheDomain.StudentInfo.WeighIn;

import java.util.Map;

/**
 * Created by Rory on 2017-08-13.
 */
public class WeighInFactory {
    public static WeighIn getWeighIn(Map<Object, Double> values)
    {
            WeighIn weighIn=new WeighIn.Builder()
                    .weighNow(values.get(80))
                    .desiredWeight(values.get(20))
                    .build();

            return weighIn;


    }

}
