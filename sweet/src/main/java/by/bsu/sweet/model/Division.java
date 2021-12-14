package by.bsu.sweet.model;

import java.util.ArrayList;
import java.util.List;

public class Division {
    private List<AbstractSweet> sweets;

    public Division(){
        sweets=new ArrayList<AbstractSweet>();
    }

    public List<AbstractSweet> getSweets() {
        return sweets;
    }

    public void add(AbstractSweet sweet){
        sweets.add(sweet);
    }
}
