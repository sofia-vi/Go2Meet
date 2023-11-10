package dte.masteriot.mdb.go2meet;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import dte.masteriot.mdb.go2meet.ui.list.Item;

public class Dataset {
    private static final String TAG = "TAGListOfItems, Dataset";
    private List<Item> listofitems;


    public Dataset() {
        Log.d(TAG, "Dataset() called");
        listofitems = new ArrayList<Item>();
        listofitems.add(new Item("Ejemplo","2/11/2024",0L));
    }

    public void fill(List<Item> items){
        listofitems=items;
    }

    public void clear(){
        listofitems.clear();
    }

    public int size(){
        return listofitems.size();
    }

    public Item getItemAtPosition(int position){
        return listofitems.get(position);
    }
}
