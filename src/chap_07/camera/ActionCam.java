package chap_07.camera;

public final class ActionCam extends Camera { // 퍼블릭 파이널 클래스 붙여주면 아예 상속을 할수 없게 됨
    public  final String lens; // = "광각렌즈";
    public ActionCam() {
        super("액션 카메라");
        lens = "광각렌즈";

    }

    public final void makeVideo() { // final 키워드를 넣으면 자식메소드에서 오버라이딩을 못함
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 멋진 비디오를 제작합니다.");
    }
}
