package com.java.iterator;

public class TestMain {
    public static void main(String[] args) {
        Item[] items =  {
            new Item("CPU", 19000),
            new Item("Keyboard", 2000),
            new Item("Iphone", 1100000),
            new Item("MAC", 200000)
        };

        Array array = new Array(items);
        Iterator it = array.iterator();

        while(it.next()) {
            Item item = (Item) it.current();
            System.out.println(item);
        }
    }
}
