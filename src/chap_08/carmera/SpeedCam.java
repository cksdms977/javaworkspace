package chap_08.carmera;

import chap_08.detector.Detectable;
import chap_08.report.Reportable;
import org.omg.PortableServer.RequestProcessingPolicy;

public class SpeedCam extends Camera {
    private Detectable detector;
    private Reportable reportable;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReportable(Reportable reportable) {
        this.reportable = reportable;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect() {
        this.detector.detect();
    }

    public void report() {
    this.reportable.report();
    }
}
