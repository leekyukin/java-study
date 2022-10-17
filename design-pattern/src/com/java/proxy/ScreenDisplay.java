package com.java.proxy;

public class ScreenDisplay implements Display {

    @Override
    public void print(String content) {
        try {
            Thread.sleep(1000); // 출력 준비를 위한 작업 시간

        } catch (InterruptedException e) {
            throw new RuntimeException("딜레이 오류");
        }

        System.out.println(content);
    }
}
