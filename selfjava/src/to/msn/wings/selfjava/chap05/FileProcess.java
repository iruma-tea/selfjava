package to.msn.wings.selfjava.chap05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileProcess {
    public static void main(String[] args) {
        try {
            var path1 = Paths.get("/home/shusuke/work_java/selfjava/data/sample.txt");

            // ファイルが存在するか
            System.out.println(Files.exists(path1));
            // ファイルは読み取り可能か
            System.out.println(Files.isReadable(path1));
            // ファイルは書き込み可能か
            System.out.println(Files.isWritable(path1));
            // ファイルは実行可能か
            System.out.println(Files.isExecutable(path1));

            // ファイルのサイズを取得
            System.out.println(Files.size(path1));

            var path2 = Files.copy(path1, Paths.get("/home/shusuke/work_java/selfjava/data/copy.txt"), StandardCopyOption.REPLACE_EXISTING);
            // ファイルを移動
            Files.move(path2, Paths.get("/home/shusuke/work_java/selfjava/data/sub/copy.txt"), StandardCopyOption.REPLACE_EXISTING);
            // ファイル名を変更
            var path3 = Files.move(path1, Paths.get("/home/shusuke/work_java/selfjava/data/sub/rename.txt"), StandardCopyOption.REPLACE_EXISTING);
            // ファイルを削除
            Files.delete(path3);
            // ファイルが存在する場合にだけ、削除
            Files.deleteIfExists(path3);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
