package stone.species;

import stone.Stone;

/**
 * Created by root on 05.12.17.
 */
public class Ruby extends Stone {

    public Ruby(int price , int mass , int quality , String name) {
        super(price , mass,quality,name);
    }


    @Override
    public String toString() {
        return "stone.species.Ruby " + super.toString();
    }

}
