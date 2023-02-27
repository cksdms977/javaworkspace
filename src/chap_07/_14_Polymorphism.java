package chap_07;

import chap_07.camera.Camera;
import chap_07.camera.FactoryCam;
import chap_07.camera.SpeedCam;

import java.util.Objects;
import java.util.concurrent.Callable;

public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다향성

        // class Person : 사람
        // class Student extends person : 학생 (학생은 사람이다. student is a person)
        // class Teacher extends person : 선생님 (선생님은 사람이다. Teacher is a person)

        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("----------------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
                cameras[2] = new SpeedCam();
                for (Camera cam : cameras) {
                    cam.showMainFeature();
                }

        System.out.println("-------------------------------");
                // factoryCam.detectFire();
                // speedCam.checkSpeed();
                // speedCam.recognizelicensePlate();

        if(camera instanceof Camera) {
            System.out.println("카메라입니다.");
        }
        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam)factoryCam).detectFire();
        }

        if (speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();
        }
//        Object[] objs = new Object[3];
//        objs[0] = new Camera();
//        objs[1] = new FactoryCam();
//        objs[2] = new SpeedCam()
    }
}
