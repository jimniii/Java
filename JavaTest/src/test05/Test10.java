package test05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test10 {
    public static void main(String[] args) {

        String path = "C:\\Users\\GGG\\Desktop\\Gugudan.txt";

        try {
            File file = new File(path);
            FileWriter fw = new FileWriter(file);

            for (int x = 2; x <= 9; x++) {
                fw.write(x + "단\n");  // 단 제목 출력 + 줄바꿈

                for (int y = 1; y <= 9; y++) {
                    int z = x * y;
                    fw.write(x + " x " + y + " = " + z + "\n"); // 결과 + 줄바꿈
                }

                fw.write("\n"); // 단 사이에 공백 줄 추가
            }

            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("구구단 파일 출력 완료");
    }
}
