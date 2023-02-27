package Chap_06;

public class _05_Overloading {

    public static int getpower(int number) { // "4"
        int result = number * number;
        return result;
        // result number * number; // 이것도 가능
    }

    public static int getpower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
        // return *= number
    }

    public static int getpowerByExp(int number, int expanent) {
        int result = 1;
        for (int i = 0; i < expanent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나
        System.out.println(getpower(3)); // 3 * 3 =9
        System.out.println(getpower(4)); // 4 * 4 = 16
        System.out.println(getpowerByExp(3,3)); // 3 * 3 * 3 = 27


    }
}
