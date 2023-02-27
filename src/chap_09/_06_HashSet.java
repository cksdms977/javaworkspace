package chap_09;

import java.util.HashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 세트 (중복을 허용하지 않음, 순서도 보장 되지 않음)
        HashSet<String> set = new HashSet<>();
        set.add("삼겹살");
        set.add("쌈장");
        set.add("음료");
        set.add("소금");
        set.add("후추");
        set.add("삼겹살");
        set.add("깻잎");
        set.add("상추");
        set.add("삼겹살");

        System.out.println("총 구매 상품 수 : " + set.size());

        // 순회
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("-------------------------");

        // 확인
        if (set. contains("삽겹살")) {
            System.out.println("삽겹살 사러 출발");
        }
        System.out.println("---------------------");

        // 삭제
        System.out.println("총 구매 상품 수 (삼겹살 구매 전) : " + set.size()); // 7
        set.remove("삽겹살");
        System.out.println("총 구매 상품 수 (삼겹살 구매 후) : " + set.size()); // 6

        System.out.println("---------------------");

        // 전체 삭제
        set.clear();
        if (set.isEmpty()) {
            System.out.println("남은 구매 상품 수 : " + set.size());
            System.out.println("집으로 출발");
        }
        System.out.println("---------------------");

        // 세트는 : 중복도 허용 x , 순서도 보장 x
        HashSet<Integer> intSet = new HashSet<>(); // new LinkedHashSet 이렇게 링크드 붙이면 순서는 보장 됨
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);
        for (int i : intSet) {
            System.out.println(i);
        }
    }
}
