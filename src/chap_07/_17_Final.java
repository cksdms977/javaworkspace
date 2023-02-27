package chap_07;

import chap_07.camera.ActionCam;
import chap_07.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // Final 상속 못하게 하는 것

        // public (fianl) class ....
        // public (fianl) void ...
        // public > abstract > static > final > .....

        ActionCam actionCam = new ActionCam();
       // actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();


        SlowActionCam slowActionCam = new SlowActionCam();

        slowActionCam.makeVideo();

    }
}
