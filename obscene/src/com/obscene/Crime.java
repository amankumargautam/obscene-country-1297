package com.obscene;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Crime {
    private int id;
    private String type;
    private String description;
    private String policeStationArea;
    private Date date;
    private String victimName;
    private List<Criminal> criminals;

    public Crime(int id, String type, String description, String policeStationArea, Date date, String victimName) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.policeStationArea = policeStationArea;
        this.date = date;
        this.victimName = victimName;
        this.criminals = new ArrayList<>();
    }

    public void addCriminal(Criminal criminal) {
        criminals.add(criminal);
    }

    public void removeCriminal(Criminal criminal) {
        criminals.remove(criminal);
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

