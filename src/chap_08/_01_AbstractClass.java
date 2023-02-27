package chap_08;

import chap_08.carmera.Camera;
import chap_08.carmera.FactoryCam;
import chap_08.carmera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화 (Date Abstraction)
        // abstract
        // 추상 클래스 (아직 완성되지 않는 클래스)
        // 추상 메소드 (추상 클래스에서만 사용 가능한, 껍데기만 있는 메소드)

        // Camera camera = new Camera(); // 카메라 객체를 만들수 없지만 자식클래스들을 만들수 있음
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
