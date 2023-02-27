package Chap_06;

public class _06_WhenToUse {
    public static int getpower(int number) {
        // int result = number * number;
        // return result;
        // result number * number; // 이것도 가능
        return getpower(number,2); // 이렇게 간단하게 호출 가능
    }
    public static int getpower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return  result;
    }
    public static void main(String[] args) {
    // 메소드 필요한 이유

    // 2의 2승을 구하기
//        int result = 1;
//        for (int i = 0; i < 2; i++) {
//            result *= 2;
//        }
//        System.out.println(result); // 2 * 2 = 4
        System.out.println(getpower(2,2)); // 2 * 2 = 4

        // 3의 3승을 구하기
//        result = 1;
//        for (int i = 0; i < 3; i++) {
//            result *= 3;
//        }
//        System.out.println(result); // 3 * 3 * 3 = 27
        System.out.println(getpower(3,3)); // 3 * 3 * 3 = 27

        // 4의 2승을 구하기
//        result = 1;
//        for (int i = 0; i < 2; i++) {
//            result *= 4;
//        }
//        System.out.println(result); // 4 * 4 = 16
        System.out.println(getpower(4,2)); //  4 * 4 = 16
}
}
