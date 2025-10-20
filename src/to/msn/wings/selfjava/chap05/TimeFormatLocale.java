package to.msn.wings.selfjava.chap05;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class TimeFormatLocale {
    public static void main(String[] args) {
        var local = Locale.JAPAN;
        var zone = ZoneId.of("Asia/Tokyo");
        var dt = ZonedDateTime.of(LocalDateTime.now(), zone);
        System.out.println(dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(local)));
        System.out.println(dt.format(DateTimeFormatter.ofPattern("Y年L月d日(E) a K時m分s秒(z)", local)));
    }
}
