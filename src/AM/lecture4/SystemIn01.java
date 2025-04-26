package AM.lecture4;

import java.io.IOException;

public class SystemIn01 {
    public static void main(String[] args) throws IOException {
        int key = System.in.read();
        // 예외처리 해야 read 사용할 수 있음. throw or try catch
        System.out.println(key);
    }
}
