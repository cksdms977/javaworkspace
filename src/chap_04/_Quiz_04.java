package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        // 문제 : 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오
        // 조건 : 주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
        //       경차 또는 장애인 차량은 최종 요금에서 50% 할인
        //      @장애인 차량 : 직접 운전 또는 탑승 모두 포함
        // 주차요금 예시 : 일반 차량 5시간 주차 시 20000원
        //               경차 5시간 주차 시 10000원
        //               장애인 차량 10시간 주차시 15000원
        // 실행결과 : 일반 차량 5시간 주차시 20000원
        //           주차 요금은 20000 원입니다.
        //           경차 5시간 주차 시 10000원
        //           주차 요금은 10000 원 입니다.
        //          장애인 차량 10시간 주차 시 15000원
        //           주차 요금은 15000 원 입니다.

        int hour = 5;
        boolean withDisabledperson = false; // 장애인 차량
        boolean isSmallCar = false; // 경차 여부

        int fee = hour * 4000; // 주차 요금 정산 (시간당 4000 원 곱하기)

        // 30000 원 초과시 일일 최대 요금으로 수정
        if (fee > 30000) {
            fee = 30000;
        }

        // 경차 또는 장애인 차량인 경우 50% 할인
        if (isSmallCar || withDisabledperson) {
            fee /= 2; // 50% 할인 적용
        }

        // 실행 결과 출력
        System.out.println("주차 요금은 " + fee + " 원 입니다.");

            

        


    }
}