package com.company;

public class Item {

    private String catagory;
    private String item;
    private boolean isAvailable;


    public Item(String catagory, String item) {
        this.catagory = catagory;
        this.item = item;
        isAvailable = true;
    }
    public String toString() {
        return catagory + " " + item ;
    }
    public boolean showAvailability() {
        return  isAvailable;

        }

        public  void changeAvailability() {
        if (isAvailable == true) {
            isAvailable = false;
        } else {
            isAvailable = true;
        }
        }
    }

