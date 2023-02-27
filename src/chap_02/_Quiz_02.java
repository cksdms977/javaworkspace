package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        // 문제 : 어린이 키에 따른 놀이 기구 탑승 가능 여부를 확인하는
        //       프로그램을 작성하시오.
        // 조건 : 키가 120cm 이상인 경우에만 탑승 가능
        //       삼항 연산자 이용
        int height = 121;
        String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
        System.out.println("키가 " + height + "cm 이므로 " +  result);

        int height2 = 115;
        String result2 = (height2 < 120) ? "탑승 불가능합니다" : "탑승가능합니다";
        System.out.println("키가 " + height2 + "cm 이므로 " + result2);


    }
}
