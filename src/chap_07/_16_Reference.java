package chap_07;

import chap_07.camera.Camera;

import java.util.Calendar;
import java.util.concurrent.Callable;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 (Primitive Date Types) : int, float, double, long, boolean, ......
        // 기본자료형은 메소드를 가지지 못함, 앞부분 소문자
        int[] i = new int[3];
        System.out.println(i[0]); // 0


        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형 (Non-Primitive, Reference Date Types) : String, Camera, FactoryCam, SpeedCam, ....
        // 참조자료형은 메소드를 가질수 있으며, 앞부분 대문자
        String [] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // null

        ////////////////////////////////////////
        int a = 10;
        int b = 20;
        b = a;
        System.out.println(a);
        System.out.println(b);
        b = 30;
        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------------");
        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2 = c1;
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "고장난 카메라";
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println("--------------------------");
        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

//        c2= null;
//        System.out.println(c2.name); // c2에 있는 값을 없앧버리고 싶을때 null 쓰면 됨
    }

    public static void changeName(Camera camera) {
        camera.name = "잘못된 카메라";
    }
}
