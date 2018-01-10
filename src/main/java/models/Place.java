package models;

import java.util.ArrayList;

/**
 * Created by Guest on 1/10/18.
 */
public class Place {
    private String name;
    private String location;
    private String notes;
    private static ArrayList<Place> instances = new ArrayList<>();
    private int id;

    public Place(String name, String location, String notes) {
        this.name = name;
        this.location = location;
        this.notes = notes;
        instances.add(this);
        this.id = instances.size();


    }

    public int getId() {
        return id;
    }

    public static Place findById(int id){
        return instances.get(id-1);
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getNotes() {
        return notes;
    }

    public static ArrayList<Place> getAll() {
        return instances;
    }

    public void update(String name, String location, String notes) {
        this.name = name;
        this.location = location;
        this.notes = notes;
    }
}
