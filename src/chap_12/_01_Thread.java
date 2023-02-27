package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 하나의 프로세스 (Process)
        // 쓰레드 (Thread)

        // 호텔 방 1 3 5 7 9
        //        2 4 6 8 10

      //  cleanBySelf();
        CleanThread cleanThread = new CleanThread();
        //cleanThread.run(); // 직원 청소 = 이렇게 하게되면 그냥 직접호출하게 되는거
        cleanThread.start(); // 새로운 쓰레드를 만들어서 제공하는거 여러가지 출력을 동시 결과가 나타남ㄴ
        cleanByBoss(); // 사장 청소

    }
    public static void cleanBySelf() {
        System.out.println("--혼자 청소 시작 --");
        for (int i = 1; i < 10; i++) {
            System.out.println("(혼자) " + i + "번방 청소 중");
        }
        System.out.println("--혼자 청소 끝--");
        }

    public static void cleanByBoss() {
        System.out.println("--사장 청소 시작 --");
        for (int i = 1; i < 10; i+=2) {
            System.out.println("(사장) " + i + "번방 청소 중");
        }
        System.out.println("--사장 청소 끝--");
    }

    }

