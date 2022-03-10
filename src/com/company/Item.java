package com.company;

public class Item {

    private String category;
    private String description;
    private boolean isAvailable;


    public Item(String category, String description) {
        this.category = category;
        this.description = description;
        this.isAvailable = true;
    }

    public String getDescription() {
        return description;
    }

    public boolean showAvailability() {
        return isAvailable;
    }

    public void makeAvailable() {
        isAvailable = true;

    }

    public void makeUnavailable() {
        isAvailable = false;
    }


    @Override
    public String toString() {
        if (!isAvailable) {
            return "Category: " + category + "\nDescription: " + description + "\nLedig?: " + isAvailable + "\n";
        } else {
            return "Category: " + category + "\nDescription: " + description + "\nLedig?: " + isAvailable + "\n";
        }
    }
}