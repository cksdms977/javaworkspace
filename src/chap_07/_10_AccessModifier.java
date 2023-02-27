package chap_07;

import com.sun.org.apache.bcel.internal.generic.BALOAD;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화 (Encapsulation)
        // 정보은닉 (information hiding)

        //접근 제어자
        // private : 해당 클래스 내에서만 접근 가능
        // Public : 모든 클래스에서 접근 가능
        // default : (아무것도 적지 않았을 때) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능

        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        // b1.resoultoin = "FHD";
        b1.setPrice(200000);
        b1.color = "블랙";

        // 할인 행사
        b1.setPrice(-5000);
        System.out.println("가격 : " + b1.getPrice() + "원");

        // 고객 문의
        System.out.println("해상도 : " + b1.resoultoin); // 해상도가 없었을때 나올때

        System.out.println("---------------------------");

        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.setModelName("하양이");
        b2.setPrice(-5000);
        b2.setColor("화이트");

        System.out.println("가격 : " + b2.getPrice() + "원");
        System.out.println("해상도 : " + b2.getResoultoin());


    }
}
