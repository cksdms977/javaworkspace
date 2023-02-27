package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);
        folder.mkdir();
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다. " + folder.getAbsoluteFile());
        }

        System.out.println("---------------------------");

        folderName = "A/B/C";
        // "A" + File.separator + "B" + File.separator + "C"

        // 윈도우 : C:\\Users\\cksdms\\Desktop
        // 맥 : \Users/cksdms/Desktop

        folder = new File(folderName);
        // folder.mkdir() // 단일 폴더 폴더를 만들려는 위치에 부모폴더가 존재하는 경우에 이렇게 쓰면됨
        folder.mkdirs(); // 여러개 하위폴더가 존재할 경우 mkdirs를 써야함
        if (folder.exists()) {
            System.out.println("폴더가 존재합니다. " + folder.getAbsoluteFile());
        } else {
            System.out.println("폴더 생성 사래 (mkdir)");
        }
    }
}
