package Patterns.Generative.Builder;

public class House {
    private String name;
    private MaterialHouse material;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setMaterial(MaterialHouse material) {
        this.material = material;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "name='" + name + '\'' +
                ", material=" + material +
                ", price=" + price +
                '}';
    }
}
