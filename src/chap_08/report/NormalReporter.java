package chap_08.report;

public class NormalReporter implements Reportable {
    @Override
    public void report() {
        System.out.println("일반 화재 신고를 진행합니다.");
    }
}
