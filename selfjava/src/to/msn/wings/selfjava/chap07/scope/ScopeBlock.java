package to.msn.wings.selfjava.chap07.scope;

public class ScopeBlock {
    public static void main(String[] args) {
        var data = "ローカルスコープ";
        // {
        // var data = "ブロックスコープ"; // エラー Duplicate local variable data
        // }
        System.out.println(data);
    }
}
