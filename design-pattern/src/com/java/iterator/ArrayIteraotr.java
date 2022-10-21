package com.java.iterator;

public class ArrayIteraotr implements Iterator {

    private Array array;
    private int index;

    public ArrayIteraotr(Array array) {
        this.array = array;
        this.index = -1;
    }

    @Override
    public boolean next() {
        index++;
        return index < array.getCount();
    }

    @Override
    public Object current() {
        return array.getItem(index);
    }
}
