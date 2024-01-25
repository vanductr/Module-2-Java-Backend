package ra.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatterF {
    public static final String PATTERN = "dd/mm/yyyy";
    public static String formatDate(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat(PATTERN);
        return sdf.format(date);
    }
}
