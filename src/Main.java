import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
formatDate("2023-03-01T13:00:00Z");
    }
    public static String formatDate(String date){
        OffsetDateTime dateTime = OffsetDateTime.parse(date);
        String medium = dateTime.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(medium);
        return medium;
    }

}