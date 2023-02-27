package chap_07;
// 여기서는 메인 메소드 필요없음 = 설계도 같은 느낌
public class BlackBox {
    String modelName; // 모델명
    String  resoultoin; // 해상도
    int price; // 가격
    String color; // 색상
    int serialNumber; // 시리얼 번호

    static int counter = 0; // 시리얼 번호를 생성해주는 역할 (처음엔 0이었다가 ++ 연산을 통해서 값을 증가)
    static boolean canAutoReport = false; // 자동 신고 가능, static 붙이면 클래스 변수가 됨

    BlackBox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("새로운 시리얼 넘버를 발급받았습니다 : " + this.serialNumber);
    }

    BlackBox(String modelName, String resoultoin, int price, String color){
//        this(); // 기본 생성자 호출
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resoultoin = resoultoin;
//        this.price = price;
//        this.color = color;
    }
    void autoReport() {
        if (canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        }
        else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) {
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFilecount(int type) {
        if (type == 1) { // 일반 영상
            return 9; // 임시로 적은거임
        }
        else if (type == 2) { // 이벤트 영상
            return 1; // 임시로 적은거
        }
        return  10;
    }
    // showDateTime : 날짜정보 표시여부
    // showSpeed : 속도정보 표시 여부
    // min : 영상 기록단위(분)
    void  record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5);
    }

    static  void callserviceCenter() {
        System.out.println("서비스 센터(1588-0000) 로 연결합니다.");
        // modelName = "test"; -> 인스턴스 변수는 바꿀수 없다. 직접 접근이 불가
        // canAutoReport = "false" -> 스택틱 메소드는 이건 가능
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    // Getter & Setter
    String getModelName() { // Getter
        return modelName;
    }

    void setModelName(String modelName) { // Setter
        this.modelName = modelName;
    }

    String getResoultoin() {
        if (resoultoin == null || resoultoin.isEmpty()) {
            return  "판매자에게 문의하세요";
        }
        return  resoultoin;
    }

    void  setResoultoin(String resoution) {
        this.resoultoin = resoution;
    }

    int getPrice() {
        return price;
    }

    void  setPrice(int price) {
        if (price < 100000) {
            this.price =100000;
        }
        else {
            this.price = price;
        }
    }
    String getter() {
        return color;
    }

    void  setColor(String color) {
        this.color = color;
    }
}
