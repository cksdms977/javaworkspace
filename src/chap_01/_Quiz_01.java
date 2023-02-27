package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        // 버스 도착 정보를 출력하는 프로그램을 작성 하시오.
        // 각 정보는 적절한 자료형의 변수에 정의합니다.
        // 정보 : 버스번호는 "1234", "상암08" 과 같은 형태
        //       남은시간은 분 단위 (예 3분, 5분)
        //       낭은 거리는 km단위 (예 1.5km, 0.8km)
        /*
        (실행결과)
        상암08번 버스
        약 3분 후 도착
        남은 거리 1.2km
         */
         // 버스 번호 (1234, 상암08)
        String busnumber = "상암08";

        // 남은 시간 (3분, 5분)
        int minute = 3;

        // 남은 거리 (1.5km, 0.8km)
        double distance = 1.2;

        // 결과 출력
        System.out.println(busnumber + "번 버스");
        System.out.println("약 " + minute + "분 후 도착 예정");
        System.out.println("남은거리 " + distance + "km");

        int busNumber2 = 1234;
        System.out.println(busNumber2 + "번 버스");

        int minute2 = 5;
        System.out.println(minute2 + "분 후 도착 예정");

        double distance2 = 0.8;
        System.out.println("남은거리 " + distance2);

    }
}
