package com.company;

public class Catalogue {

    private int counter;

    private Item[] items;

    public Catalogue (int number) {
        this.items = new Item[number];
    }

    public void addItem(Item i) {
        items[counter++] = i;
    }

    public Item[] getFullList() {
        return items;
    }

    public Item[] getAvailableItems() {
        Item[] availables = new Item[counter];
        for(int i = 0; i < counter; i++) {
            Item temp = items[i];
            if (temp != null && temp.showAvailability()) {
                availables[i] = temp;
            }
        }
        return availables;
    }

    public Item findItem(String searchName) {
        for(int i = 0; i < counter; i++) {
            Item temp = items[i];
            if (temp != null && temp.getDescription().equals(searchName)) {
                return temp;
            }
        }
        return null;
    }

    public void borrowItem(Item found) {
        found.makeUnavailable();

    }

    public void returnItem(Item found) {
        found.makeAvailable();
    }
}