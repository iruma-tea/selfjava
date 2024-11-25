package to.msn.wings.selfjava.chap05;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileWrite {
    public static void main(String[] args) throws Exception {
        Files.write(
            Paths.get("/home/shusuke/work_java/selfjava/data/list.txt"),
            List.of(
                "春はあけぼの。やうやう白くなり行く、山ぎはすこし...",
                "夏は夜。月のころはさらなり。やみもなほ、ほたるの...",
                "秋は夕暮れ。夕日のさして山の端いと近うなりたるに...",
                "冬はつとめて。雪の降りたるは、いふべきにもあらず..."
            ),
            StandardCharsets.UTF_8
        );
    }
}
