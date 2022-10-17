package com.java.proxy;

public class TestMain {
    public static void main(String[] args) {
//        Display display = new ScreenDisplay();    // 10초
        Display display = new BufferDisplayProxy(5);    // 2초

        display.print("난 지금");
        display.print("프록시 패턴을 공부 중이란다");
        display.print("디자인 패턴 정말 재미있어 하하하하하하하!");
        display.print("반어법 아님. 진짜 배울 수록 \'와~\' 소리만 나옴 ");
        display.print("세상 이런 천제들이 있구나~ 이런 너낌 너도 알지?");
        display.print("으하하하하하하하! 으하하하핳하하하!?");
        display.print("오늘은 너의 세상이 부서지는 날이야~🎵");
        display.print("영원히 끝나지 않을 것 같던 춤과 노래는~🎵");
        display.print("갑자기 멈춰버렸고");
        display.print("너는 벌거벗은 채~ 가엽은 날짐승처럼 떨다가 울어버렸네~");

        ((BufferDisplayProxy) display).flush();
    }
}
