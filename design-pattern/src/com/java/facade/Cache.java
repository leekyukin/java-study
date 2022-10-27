package com.java.facade;

import java.util.HashMap;

public class Cache {
    private HashMap<String, Row> cache = new HashMap<String, Row>();

    public void put(Row row) {
        cache.put(row.getName(), row);
    }

    public Row get(String name) {
        return cache.get(name);
    }
}
