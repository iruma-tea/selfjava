package to.msn.wings.selfjava.chap04;

public class SwitchWhen {
    public static void main(String[] args) {
        Object obj = 123;

        switch(obj) {
            case Integer i when i >= 15 -> System.out.println("15以上の整数です。");
            case Integer i -> System.out.println("整数です。");
            default -> System.out.println("意図しない型です。");
        }
    }
}
