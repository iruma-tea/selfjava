package to.msn.wings.selfjava.chap05;

import java.util.regex.Pattern;

public class RegMulti {
    public static void main(String[] args) {
        var str = "10人のインデアン。\n1年生になったら";
        var ptn = Pattern.compile("^\\d*", Pattern.MULTILINE);
        var match = ptn.matcher(str);
        while (match.find()) {
            System.out.println(match.group());
        }
    }
}
