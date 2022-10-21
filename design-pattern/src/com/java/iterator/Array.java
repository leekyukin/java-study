package com.java.iterator;

public class Array implements Aggregator {

    private Item[] items;

    public Array(Item[] items) {
        this.items = items;
    }

    public Item getItem(int index) {
        return this.items[index];
    }

    public int getCount() {
        return this.items.length;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIteraotr(this);
    }
}
