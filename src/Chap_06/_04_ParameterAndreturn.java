package Chap_06;

public class _04_ParameterAndreturn {
//    public static void power(int number) { // Parameter, 매개변수
//        int result = number * number;
//        System.out.println(number + " 의 2 승은" + result);
//    }

    public static int getpower(int number) {
        int result = number * number;
        return result;
        // result number * number; // 이것도 가능
    }
//
//    public static void powerByExp(int number, int expanent) {
//        int result = 1;
//        for (int i = 0; i < expanent; i++) {
//            result *= number;
//        }
//        System.out.println(number + " 의 " + expanent + " 승은 " + result);
//    }

    public static int getpowerByExp(int number, int expanent) {
        int result = 1;
        for (int i = 0; i < expanent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        // 전달값과 반환값이 있는 메소드
        int reVal = getpower(2); // 2 * 2 = 4;
        System.out.println(reVal); // 2 * 2 = 4

        reVal = getpower(3);
        System.out.println(reVal); // 3 * 3 = 9

        reVal = getpowerByExp(3,3);
        System.out.println(reVal); // 3 * 3 * 3 = 27

        System.out.println(getpowerByExp(2,4)); // 2 * 2 * 2 * 2 = 16
    }
}
