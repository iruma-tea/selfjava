package to.msn.wings.selfjava.chap03;

public class Shortcut {
    public static void main(String[] args) {
        String str = null;
        // 変数strが「https」で始まる場合にメッセージを表示
        if (str != null && str.startsWith("https://")) {
            System.out.println("「https://～」で始まります。");
        }
    }
}
