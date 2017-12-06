package stone;

/**
 * Created by root on 05.12.17.
 */
public class Stone {

    private int mass;
    private int quality;
    private String name;
    int price;

    @Override
    public String toString() {
        return "stone.Stone{" +
                "mass=" + mass +
                ", quality=" + quality +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Stone(int price , int mass , int quality , String name) {
        this.mass = mass;
        this.quality = quality;
        this.name = name;
        this.price = price;
    }


    public int get_price() {
        return price;
    }


    public void set_price(int price) {
        this.price = price;
    }


    public int get_mass() {
        return mass;
    }


    public void set_mass(int mass) {
        this.mass = mass;
    }


    public String get_name() {
        return name;
    }


    public void set_name(String name) {
        this.name = name;
    }



    public int get_quality() {
        return quality;
    }


    public void set_guality(int quality) {
        this.quality = quality;
    }
}
