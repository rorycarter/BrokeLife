package Factories;

import TheDomain.Foods.FoodType;

import java.util.Map;

/**
 * Created by Rory on 2017-08-14.
 */
public class FoodTypeFactory {
    public static FoodType getFoodType(Map<String,String> values)
    {

        FoodType foodType=new FoodType.Builder()
               .carbohydrates(values.get("carbs"))
               .dairy(values.get("dairy"))
               .fruits(values.get("fruits"))
               .protein(values.get("protein"))
               .saturatedFats(values.get("saturatedFats"))
               .vegetables(values.get("vegetables"))
                .copy();
        return foodType;

    }
}
