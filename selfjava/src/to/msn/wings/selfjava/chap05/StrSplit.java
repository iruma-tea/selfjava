package to.msn.wings.selfjava.chap05;

public class StrSplit {
    public static void main(String[] args) {
        var str1 = "うめ,もも,さくら";
        var result = str1.split(",");
        System.out.println(String.join("&", result));

        var str2 = "うめ,もも,さくらとあんず";
        var result2 = str2.split("[,と]");
        System.out.println(String.join("&", result2));

        var str3 = "うめ,もも,さくら";
        var result3 = str3.split("");
        System.out.println(String.join("&", result3));

        var str4 = "うめ,もも,さくら,あんず";
        var result4 = str4.split(",", 3);
        System.out.println(String.join("&", result4));
    }
}
