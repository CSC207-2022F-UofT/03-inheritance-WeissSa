/*
 * This file defines an abstract class named Bag.
 * In this exercise, you will be writing a larger class according to
 * the TODOs we have left you. You may find the readings in chapter
 * 1. Introduction to Java helpful.
 */

public abstract class Bag {
    /*
     */
    private String color;
    private int numberOfContents;
    private int capacity;
    private String[] contents;



    /*
     *
     * The other attributes (private instance variables) should
     * be empty (e.g. numberOfContents is 0 and an empty String array for
     * its contents.)
     */
    public Bag(String bagColor, int bagCapacity){
        color = bagColor;
        capacity = bagCapacity;
        numberOfContents = 0;
        contents = new String[capacity];
    }




    /*
     */
    public String getColor(){
        return color;
    }
    public int getNumberOfContents(){
        return numberOfContents;
    }
    public int getCapacity(){
        return capacity;
    }



    /*
     */

    public void setColor(String newColor) {
        color = newColor;
    }





    /*
     *
     *       This method should return true if the item was added
     *       and false otherwise.
     */

    public boolean addItem(String newItem) {
        if (numberOfContents < capacity) {
            contents[numberOfContents] = newItem;
            numberOfContents ++;
            return true;
        } else {
            return false;
        }
    }





    /**
     *
     * If there are no items in this Bag, return null.
     *
     * @return
     */
    public String popItem() {
        int index = numberOfContents > 0 ? numberOfContents - 1 : numberOfContents;
        String value = contents[index];
        contents[index] = null;
        numberOfContents --;
        return value;
    }





    /**
     * Increase this bag's capacity by n.
     *
     * @param n the amount to increase this Bag's capacity by
     */
    public void increaseCapacity(int n) {
        capacity += n;
        String[] newContent = new String[capacity];
        for (int i = 0; i < contents.length; i++) {
            newContent[i] = contents[i];
        }
        contents = newContent;

    }

    /**
     * Return the details of this Bag.
     * This method requires you to have created the private
     * instance variables mentioned above.
     *
     * @return
     */
    @Override
    public String toString() {
        return this.color + " Bag (" + this.numberOfContents + " / " +
                this.capacity + ")";
    }

    /*
     * Below we have defined an abstract method.
     * This method takes no arguments and does not return anything.
     * It increases the capacity of this Bag.
     *
     * You will need to implement this method in
     * HandBag.java and CrossbodyBag.java.
     *
     * We recommend you look at HandBag.java first.
     */
    public abstract void enhance();
}