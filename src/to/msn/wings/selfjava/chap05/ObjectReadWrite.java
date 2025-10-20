package to.msn.wings.selfjava.chap05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectReadWrite {
    public static void main(String[] args) {
        final var file = "./data/article.ser";

        // オブジェクトのシリアライズ&保存
        try (var out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(new Article("最新Javaアップデート解説", "https://codezine.jp/article/839", false));
        } catch (IOException e) {
            e.printStackTrace();
        }

        // ファイルオブジェクトを取得
        try (var in = new ObjectInputStream(new FileInputStream(file))) {
            var a = (Article) in.readObject();
            System.out.println(a);
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }
}
