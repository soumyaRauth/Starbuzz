package com.soumya.starbuzz;

/**
 * Created by Soumya on 11/20/2016.
 */

public class Drink {

    private String name;
    private String description;
    private int imageResourceId;

    public static final Drink[] drinks={
            new Drink("Lattle","A Couple of espresso shots with steamed milk",R.drawable.latte),
            new Drink("Cappuccino","A Couple of espresso shots with steamed milk",R.drawable.cappuccino),
            new Drink("Filter","A Couple of espresso shots with steamed milk",R.drawable.filter)
        };

        private Drink(String name, String description,int imageResourceId){
            this.name=name;
            this.description=description;
            this.imageResourceId=imageResourceId;
        }
    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }

}
