package chap_09.coffee;

public class CaffeebyNickname {
    public String nickname;

    public CaffeebyNickname(String nickname) {
        this.nickname = nickname;
    }

    public void ready() {
        System.out.println("커피 준비 완료 : " + nickname);
    }
}
