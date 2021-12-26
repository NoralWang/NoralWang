package by.bsu.sweet.model;

import java.util.ArrayList;
import java.util.List;

public class Present {
    private List<AbstractSweet> sweets;

    public Present(){
        sweets=new ArrayList<AbstractSweet>();
    }

    public List<AbstractSweet> getSweets() {
        return sweets;
    }

    public void add(AbstractSweet sweet){
        sweets.add(sweet);
    }
}
