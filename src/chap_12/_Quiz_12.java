package chap_12;

import java.util.TreeMap;

// 문제 : 상품 A와 상품 B 로 이루어진 세트 상품을 효율적으로 포장하는 프로그램을 작성하시오
// 조건 : 상품 A 와 상품 B 는 각각 5개씩 준비
//       상품 A 와 상품 B 는 두 사람이 독립적으로 준비
//       상품 A 와 상품 B 가 모두 준비된 이후 세트 상품 포장 시작
//       포장이 필요한 세트 상품은 총 5개
//       (필요 시) 모든 클래스는 하나의 파일에 정의
public class _Quiz_12 {
    public static void main(String[] args) {
        Runnable runnableA = () -> {
            for (int i = 1; i < 5; i++) {
                System.out.println("A 상품 준비 " + i + "/5");

            }
            System.out.println("-- A 상품 준비 완료 -- ");
        };

        Runnable runnableB = () -> {
            for (int i = 1; i < 5; i++) {
                System.out.println("B 상품 준비 " + i + "/5");

            }
            System.out.println("-- B 상품 준비 완료 -- ");
        };

        Thread threadA = new Thread(runnableA);
        Thread threadB = new Thread(runnableB);

        threadA.start();
        threadB.start();

        while (threadA.isAlive() || threadB.isAlive()) {

        } // 밑에 트라이 문이랑 똑같이 결과가 나옴

//        try {
//            threadA.join();
//            threadB.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        Runnable runnableSet = () -> {
            System.out.println("== 세트 상품 포장 시작 ==");
            for (int i = 1; i < 5; i++) {
                System.out.println("세트 상품 포장 " + i + "/5");

            }
            System.out.println("== 세트 상품 준비 완료 == ");
        };
        Thread thread = new Thread(runnableSet);
        thread.start();

    }
}
