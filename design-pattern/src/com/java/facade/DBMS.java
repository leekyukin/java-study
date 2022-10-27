package com.java.facade;

import java.util.HashMap;

public class DBMS {
    private HashMap<String, Row> db = new HashMap<String, Row>();

    public DBMS() {
        db.put("kyujin", new Row("kyujin", "2005-04-14", "kyujin@gmail.com"));
        db.put("harin", new Row("harin", "2006-10-04", "harin@gmail.com"));
        db.put("GD", new Row("GD", "1988-08-18", "gd@gmail.com"));
    }

    public Row query(String name) {
        try {
            // DB 조회 시간 1초
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return db.get(name.toLowerCase());
    }
}
