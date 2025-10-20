package to.msn.wings.selfjava.chap05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class StreamWrite {
    public static void main(String[] args) {
        try (var writer = Files.newBufferedWriter(Paths.get("./data/data.log"))) {
            writer.write(LocalDateTime.now().toString());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
