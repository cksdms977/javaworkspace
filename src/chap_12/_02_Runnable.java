package chap_12;

import chap_12.clean.CleanRunnable;
import chap_12.clean.CleanThread;

public class _02_Runnable {
    public static void main(String[] args) {
        // 쓰레드를 다르게 만드는 방법
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        cleanByBoss();
    }
        public static void cleanByBoss() {
            System.out.println("--사장 청소 시작 --");
            for (int i = 1; i < 10; i+=2) {
                System.out.println("(사장) " + i + "번방 청소 중");
            }
            System.out.println("--사장 청소 끝--");
        }
    }
