package com.example.thuytq_pc.timbus.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by THUYTQ-PC on 07-Oct-17.
 */

public class DataService {
    public static final DataService ourInstance = new DataService();
    public ArrayList<BusCar> busCars = new ArrayList<BusCar>();
    static DataService getInstance() {
        return ourInstance;
    }

    public void addNew(BusCar newBusCar) {
        busCars.add(newBusCar);
    }
    public void removeAt(int index) {
        busCars.remove(index);
    }
    public void updateWithItemAt(int index, BusCar newBusCar) {
        busCars.get(index);
        busCars.set(index, newBusCar);
    }

}
