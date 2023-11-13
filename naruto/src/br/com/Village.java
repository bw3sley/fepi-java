import java.util.ArrayList;

import java.util.List;

public class Village {
    private String name;
    private List<Ninja> ninjas;

    public Village(String name) {
        this.name = name;
        this.ninjas = new ArrayList<>();
    }

    public addNewNinja(Ninja ninja) {
        ninjas.add(ninja);
    }
}
