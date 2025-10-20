package to.msn.wings.selfjava.chap05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryReadWrite {
    public static void main(String[] args) {
        try (
                var in = new BufferedInputStream(new FileInputStream("./data/input.png"));
                var out = new BufferedOutputStream(new FileOutputStream("./data/output.png"))) {
            var data = -1;
            while ((data = in.read()) != -1) {
                out.write((byte) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
