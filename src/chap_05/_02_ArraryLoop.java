package chap_05;

public class _02_ArraryLoop {
    public static void main(String[] args) {
        // 배열의 순회
        String[] coffees = { "아메리카노", "카페모카", "라떼", "카푸치노" };
        // System.out.println(coffees[0] + " 하나"); // 이렇게 하면 계속 적어야 하니 힘들기때문에
        // System.out.println(coffees[1] + " 하나"); // 반복문 사용
        // ......
        // for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("-------------------------");

        // 배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i] + " 하나");
        }
        System.out.println("주세요");

        System.out.println("-----------------------------");
        // enhanced for (for-each) 반복문
        for (String coffee : coffees) {
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");


    }
}
