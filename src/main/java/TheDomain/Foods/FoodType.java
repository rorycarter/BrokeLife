package TheDomain.Foods;

/**
 * Created by Rory on 2017-08-07.
 */
public class FoodType {

    private String dairy;
    private String protein;
    private String saturatedFats;
    private String carbohydrates;
    private String fruits;
    private String vegetables;


    public void setCarbohydrates(String carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public String getCarbohydrates() {
        return carbohydrates;
    }

    public void setDairy(String dairy) {
        this.dairy = dairy;
    }

    public String getDairy() {
        return dairy;
    }

    public void setFruits(String fruits) {
        this.fruits = fruits;
    }

    public String getFruits() {
        return fruits;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getProtein() {
        return protein;
    }

    public void setSaturatedFats(String saturatedFats) {
        this.saturatedFats = saturatedFats;
    }

    public String getSaturatedFats() {
        return saturatedFats;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getVegetables() {
        return vegetables;
    }

    public FoodType()
    {


    }

    private FoodType(Builder copy)
    {
        this.carbohydrates=copy.carbohydrates;
        this.dairy=copy.dairy;
        this.fruits=copy.fruits;
        this.protein=copy.protein;
        this.saturatedFats=copy.saturatedFats;
        this.vegetables=copy.vegetables;


    }
    public static class Builder
    {
        private String dairy;
        private String protein;
        private String saturatedFats;
        private String carbohydrates;
        private String fruits;
        private String vegetables;

        public Builder dairy(String value)
        {

            this.dairy=value;
            return this;
        }
        public Builder protein(String value)
        {

            this.protein=value;
            return this;
        }
        public Builder saturatedFats(String value)
        {

            this.saturatedFats=value;
            return this;
        }
        public Builder carbohydrates(String value)
        {

            this.carbohydrates=value;
            return this;
        }
        public Builder fruits(String value)
        {

            this.fruits=value;
            return this;
        }

        public Builder vegetables(String value)
        {

            this.vegetables=value;
            return this;

        }
        public FoodType copy()
        {


            return new FoodType(this);

        }





    }

}
