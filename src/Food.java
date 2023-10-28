public class Food {
    private String name;

    // Constructor
    Food (String name){

        this.name = name;
    }

    public String getFoodName() {

        return name;
    }

    public void setFoodName(String name) {

        this.name = name;
    }

    @Override
    public String toString() {

        return "Food{name='" + this.getFoodName() + "'}";
    }
}
