package chap_09.coffee;

public class CaffeeByNumber {
    public int waitingNumber;

    public CaffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + waitingNumber);
    }
}
