package to.msn.wings.selfjava.chap04.practice;

public class Practice2 {
    public static void main(String[] args) {
        var i = 1;
        var sum = 0;

        while (i <= 1000) {
            sum += i;
            if (sum > 1000) {
                break;
            }
            i++;
        }
        System.out.println("合計が1000を超えるのは、1～" + i + "加算したときです。");
    }
}
