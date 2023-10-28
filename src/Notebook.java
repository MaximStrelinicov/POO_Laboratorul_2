public class Notebook {
    private String brand;
    private String model;

    // Constructor
    public Notebook(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getNotebookBrand() {
        return this.brand;
    }

    public void setNotebookBrand(String brand) {
        this.brand = brand;
    }

    public String getNotebookModel() {

        return this.model;
    }

    public void setNotebookModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + this.getNotebookBrand() + '\'' +
                ", model='" + this.getNotebookModel() + '\'' +
                '}';
    }
}