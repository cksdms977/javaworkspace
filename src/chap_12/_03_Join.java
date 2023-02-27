package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        try {
            thread.join(2500); // 2. 5초 대기 join의 역할쓰레드가 종료될때까지 기다렸다가 다 끝나면 클린바이보스가 출력됨
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByBoss();
    }

    public static void cleanByBoss() {
        System.out.println("--사장 청소 시작 --");
        for (int i = 1; i < 10; i+=2) {
            System.out.println("(사장) " + i + "번방 청소 중");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("--사장 청소 끝--");
    }
}
