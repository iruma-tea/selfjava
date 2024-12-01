package to.msn.wings.selfjava.chap05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class StreamReader {
    public static void main(String[] args) {
        try (var reader = Files.newBufferedReader(Paths.get("/home/shusuke/work_java/selfjava/data/sample.txt"))) {
            var line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}