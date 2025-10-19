package to.msn.wings.selfjava.chap05;

public class AutoBoxing {
    public static void main(String[] args) {
        // Long logの誤り
        Long result = 0L;

        // 1～999の総和を求める。
        for (var i = 1; i < 1000; i++) {
            result += i;
        }
        System.out.println(result);
    }
}
