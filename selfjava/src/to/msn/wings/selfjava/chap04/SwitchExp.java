package to.msn.wings.selfjava.chap04;

public class SwitchExp {
    public static void main(String[] args) {
        var drink = "ビール";
        System.out.println(switch(drink){
            case "日本酒", "ビール", "ワイン" -> "醸造酒です。";
            case "ブランデー", "ウィスキー" -> "蒸留酒です。";
            default -> "不明";
        });
    }
}
