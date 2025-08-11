package to.msn.wings.selfjava.chap07.scope2;

public class ScopeBlock {
    public static void main(String[] args) {
        {
            var data = "ブロックスコープ";
            System.out.println(data);
        }
        {
            var data2 = "ブロックスコープ2";
            System.out.println(data2);
        }
    }
}
