package Factories;

import TheDomain.Foods.DietLaw;

import java.util.Map;

/**
 * Created by Rory on 2017-08-14.
 */
public class DietLawFactory {
    public static DietLaw getDietLaw(Map<String,String> values)
    {

        DietLaw dietLaw=new DietLaw.Builder()
                .kosher(values.get("kosher"))
                .halaal(values.get("halaal"))
                .build();
        return dietLaw;

    }
}
