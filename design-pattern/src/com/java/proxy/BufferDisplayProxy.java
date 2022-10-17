package com.java.proxy;

import java.util.ArrayList;

public class BufferDisplayProxy implements Display {
    private ArrayList<String> buffer = new ArrayList<>();
    private ScreenDisplay screen = new ScreenDisplay();
    private int bufferSize;

    public BufferDisplayProxy(int bufferSize) {
        this.bufferSize = bufferSize;
    }

    @Override
    public void print(String content) {
        buffer.add(content);

        if(this.bufferSize == buffer.size()) {
            flush();
        }
    }

    void flush() {
        if (screen == null)
            screen = new ScreenDisplay();

        String lines = String.join("\n", buffer);

        screen.print(lines);
        buffer.clear();
    }
}
