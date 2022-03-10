package com.company;

public class Catalogue {

    private int counter;

    private Item[] items;

    public Catalogue(int number) {
        this.items = new Item[number];
    }

    public void addItem(Item i) {
        items[counter++] = i;

    }

    public Item[] getFullList() {
        return items;

    }

    public Item[] getAvailableItems() {
        Item[] availables = new Item[items.length];
        for (int i = 0; i < items.length; i++) {
            Item temp = items[i];
            if (temp != null && temp.showAvailability()) {
                availables[i] = temp;
            }
        }
        return availables;
    }


    public Item findItem(String searchName) {
        int i;
        for (i = 0; i < items.length; i++) ;
        if (items[i].equals(searchName)) {

        }

    }

    public void borrowItem(String found) {



        }
    }
