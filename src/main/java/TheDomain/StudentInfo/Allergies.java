package TheDomain.StudentInfo;
import java.util.*;
/**
 * Created by Rory on 2017-08-06.
 */
public class Allergies {

    private String foodAllergies;
    ArrayList<Allergies>types=new ArrayList<>();
    public String getFoodAllergies() {
        return foodAllergies;
    }

    public Allergies()
    {

    }

    private Allergies(Builder build)
    {

        this.foodAllergies=build.foodAllergies;


    }
    public static class Builder
    {

        private String foodAllergies;


        public Builder foodAllergies(String value)
        {
            this.foodAllergies=value;
            return this;


        }


        public Allergies build()
        {

            return new Allergies(this);

        }

    }


}